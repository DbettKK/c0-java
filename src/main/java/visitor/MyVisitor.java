package visitor;

import antlr.scratchParser;
import c0.C0BaseVisitor;
import c0.C0Parser;
import listener.utils.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyVisitor extends C0BaseVisitor<Expression> {
    private static final Map<String, Function> funcTable = new HashMap<>();
    private static Map<String, FunctionNode> functionNodeMap = new HashMap<>();
    private int nodeOffset = 0;
    private static Map<String, List<Expression>> callFuncParam = new HashMap<>();
    private static Map<String, List<FunctionParam>> funcParam = new HashMap<>();
    private int funcOffset = 0;
    // 全局符号表
    //private final SymbolTable symbolTable = new SymbolTable(null, "#start");
    private static String currentFunc = "#start";
    private static int currentBlock = 0;
    private int stdOffset = 25000;
    private static final Map<String, List<SymbolTable>> symMap = new HashMap<>();
    private boolean funcFlag;

    @Override
    public Expression visitProgram(C0Parser.ProgramContext ctx) {
        List<SymbolTable> tableList = new ArrayList<>();
        tableList.add(new SymbolTable(null, currentFunc));
        symMap.put(currentFunc, tableList);
        List<ParseTree> children = ctx.children;
        for (ParseTree child : children) {
            if (child instanceof C0Parser.FunctionContext) {
                String funcName = ((C0Parser.FunctionContext) child).IDENT().getText();
                if (functionNodeMap.get(funcName) != null) {
                    throw new RuntimeException("duplicated-func-name");
                }
                functionNodeMap.put(funcName, new FunctionNode((C0Parser.FunctionContext) child, nodeOffset++));
            }
        }
        callFuncParam.put("main", new ArrayList<>());
        funcTable.put("main", new Function(
                "main",
                new HashMap<>(),
                Type.VOID,
                funcOffset++,
                0
        ));
        for (ParseTree child : children) {
            if (child instanceof C0Parser.FunctionContext) {
                String funcName = ((C0Parser.FunctionContext) child).IDENT().getText();
                if (funcName.equals("main")) {
                    visit(child);
                }
            } else visit(child);
        }
        return null;
    }

    @Override
    public Expression visitLetDeclStmt(C0Parser.LetDeclStmtContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        if (ctx.ASSIGN() != null) {
            Expression expression = visit(ctx.expr());
            Type declareType = Utils.getType(ctx.ty.getText());
            if (declareType != expression.getType()) {
                throw new RuntimeException("assign-let-type-conflict");
            }
            table.put(ident, new SymbolEntry(
                    false,
                    true,
                    table.getOffset(),
                    expression.getType(),
                    expression.getValue()
            ));
        } else {
            table.put(ident, new SymbolEntry(
                    false,
                    false,
                    table.getOffset(),
                    Utils.getType(ctx.ty.getText()),
                    null
            ));
        }
        return null;
    }

    @Override
    public Expression visitConstDeclStmt(C0Parser.ConstDeclStmtContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        Expression expression = visit(ctx.expr());
        Type declareType = Utils.getType(ctx.ty.getText());
        if (declareType != expression.getType()) {
            throw new RuntimeException("assign-const-type-conflict");
        }
        table.put(ident, new SymbolEntry(
                true,
                true,
                table.getOffset(),
                expression.getType(),
                expression.getValue()
        ));
        return null;
    }

    @Override
    public Expression visitFunction(C0Parser.FunctionContext ctx) {
        // 可能是main或者不是

        int paramOffset = 0;
        String funcName = ctx.IDENT().getText();
        /*if (funcTable.get(funcName) != null) {
            throw new RuntimeException("duplicated-func-name");
        }*/
        currentFunc = funcName;
        // 取得调用当前函数的实际参数
        int actualParamNum, declareParamNum = 0;
        List<Expression> actualParamList = callFuncParam.get(funcName);
        actualParamNum = actualParamList.size();
        List<Type> declareParamList = new ArrayList<>();
        Map<String, FunctionParam> paramMap = new HashMap<>();
        if (ctx.functionParamList() != null) {
            List<C0Parser.FunctionParamContext> paramList = ctx.functionParamList().functionParam();
            declareParamNum = paramList.size();
            for (C0Parser.FunctionParamContext param : paramList) {
                declareParamList.add(Utils.getType(param.ty.getText()));
            }
        }
        // judge
        if (actualParamNum != declareParamNum) {
            throw new RuntimeException("param-num-error");
        }
        for (int i = 0; i < actualParamNum; i++) {
            if (actualParamList.get(i).getType() != declareParamList.get(i))
                throw new RuntimeException("param-type-error");
        }
        if (ctx.functionParamList() != null) {
            List<C0Parser.FunctionParamContext> paramList = ctx.functionParamList().functionParam();
            for (C0Parser.FunctionParamContext param : paramList) {
                paramMap.put(param.IDENT().getText(), new FunctionParam(
                        param.isConst!=null,
                        param.IDENT().getText(),
                        Utils.getType(param.ty.getText()),
                        paramOffset,
                        actualParamList.get(paramOffset).getValue()
                ));
                paramOffset++;
            }
        }

        //

        List<SymbolTable> tableList = new ArrayList<>();
        SymbolTable startTable = symMap.get("#start").get(symMap.get("#start").size() - 1);
        tableList.add(new SymbolTable(startTable, funcName));
        symMap.put(currentFunc, tableList);
        funcFlag = false;
        funcParam.clear();
        List<FunctionParam> paramList = new ArrayList<>();
        for (String s : paramMap.keySet()) {
            paramList.add(paramMap.get(s));
        }
        funcParam.put(funcName, paramList);
        currentBlock = 0;
        String tmp = currentFunc;
        Expression returnExpresstion = visit(ctx.blockStmt());
        currentFunc = tmp;
        Type actualReturnType = returnExpresstion.getType();
        if (actualReturnType != Utils.getType(ctx.ty.getText()))
            throw new RuntimeException("return-type-error");
        funcTable.put(funcName, new Function(
                funcName,
                paramMap,
                Utils.getType(ctx.ty.getText()),
                funcOffset++,
                returnExpresstion.getValue()
        ));
        return returnExpresstion;
    }

    @Override
    public Expression visitBlockStmt(C0Parser.BlockStmtContext ctx) {
        if (!funcFlag) {
            funcFlag = true;
        } else{
            List<SymbolTable> tableList = symMap.get(currentFunc);
            SymbolTable table = new SymbolTable(tableList.get(tableList.size() - 1), currentFunc);
            tableList.add(table);
            currentBlock++;
        }
        Expression returnExpresstion = null;
        for (C0Parser.StmtContext stmtContext : ctx.stmt()) {
            if (stmtContext.returnStmt() != null) {
                System.out.println("return");
                returnExpresstion = visit(stmtContext);
            }
            else visit(stmtContext);
        }
        if (currentBlock > 0) currentBlock--;
        if (returnExpresstion == null) {
            return new Expression(0, Type.VOID);
        }

        return returnExpresstion;
    }

    @Override
    public Expression visitReturnStmt(C0Parser.ReturnStmtContext ctx) {
        if (ctx.expr() != null)
            return visit(ctx.expr());
        else
            return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitFuncLabelExpr(C0Parser.FuncLabelExprContext ctx) {
        return visit(ctx.funcExpr());
    }

    @Override
    public Expression visitFuncExpr(C0Parser.FuncExprContext ctx) {
        if (ctx.callFunc() != null) return visit(ctx.callFunc());
        else return visit(ctx.callStdlib());
    }

    @Override
    public Expression visitCallFunc(C0Parser.CallFuncContext ctx) {
        String funcName = ctx.IDENT().getText();
        FunctionNode functionNode = functionNodeMap.get(funcName);
        if (functionNode == null) throw new RuntimeException("call-undeclared-func");
        // 添加实际参数
        List<Expression> paramList = new ArrayList<>();
        for (ParseTree child : ctx.children) {
            if (child instanceof C0Parser.ExprContext) {
                Expression param = visit(child);
                paramList.add(param);
            }
        }
        int tmp = currentBlock;
        String tmpFunc = currentFunc;
        callFuncParam.put(funcName, paramList);
        Map<String, List<Expression>> tmpMap = callFuncParam;
        Expression returnExpression = visit(functionNode.getFunctionContext());
        currentBlock = tmp;
        currentFunc = tmpFunc;
        callFuncParam = tmpMap;

        //if (funcTable.get(funcName) == null) throw new RuntimeException("call-undeclared-func");
        /*Function function = funcTable.get(funcName);
        // TODO 执行函数
        if (function.getReturnType() == Type.VOID) {
            return new Expression(0, Type.VOID);
        }
        Map<String, FunctionParam> paramMap = function.getParamMap();*/
        return returnExpression;
    }

    @Override
    public Expression visitGetInt(C0Parser.GetIntContext ctx) {
        return new Expression(1, Type.INT);
    }

    @Override
    public Expression visitGetChar(C0Parser.GetCharContext ctx) {
        return new Expression(97, Type.INT);
    }

    @Override
    public Expression visitGetDouble(C0Parser.GetDoubleContext ctx) {
        return new Expression(1.5, Type.DOUBLE);
    }

    @Override
    public Expression visitPutInt(C0Parser.PutIntContext ctx) {
        Expression e = visit(ctx.expr());
        if (e.getType() != Type.INT) {
            throw new RuntimeException("putint-not-int");
        }
        System.out.println(e);
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutDouble(C0Parser.PutDoubleContext ctx) {
        Expression e = visit(ctx.expr());
        if (e.getType() != Type.DOUBLE) {
            throw new RuntimeException("putdouble-not-double");
        }
        System.out.println(e.getValue());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutChar(C0Parser.PutCharContext ctx) {
        Expression e = visit(ctx.expr());
        if (e.getType() != Type.INT) {
            throw new RuntimeException("putchar-not-char");
        }
        System.out.println(e.getValue());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutStr(C0Parser.PutStrContext ctx) {
        System.out.println(ctx.str().getText());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutLn(C0Parser.PutLnContext ctx) {
        System.out.println();
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitAssignExpr(C0Parser.AssignExprContext ctx) {
        boolean isParam = false;
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String leftId = ctx.IDENT().getText();
        //if (funcTable.get(currentFunc).getParamMap() != null)
        //System.out.println(funcTable);
        //System.out.println(currentFunc);
        if (funcTable.get(currentFunc).getParamMap() != null
                && funcTable.get(currentFunc).getParamMap().get(leftId) == null
                && table.getChainTable(leftId) == null) {
            throw new RuntimeException("assign-to-undeclared-ident");
        } else {
            if (table.getChainTable(leftId) != null && table.getChainTable(leftId).isConst()) {
                throw new RuntimeException("assign-to-const-ident");
            } else if (funcTable.get(currentFunc).getParamMap().get(leftId) != null
                    && funcTable.get(currentFunc).getParamMap().get(leftId).isConst()) {
                throw new RuntimeException("assign-to-const-ident");
            } else if (funcTable.get(currentFunc).getParamMap().get(leftId) != null) {
                isParam = true;
            }
        }
        Expression e = visit(ctx.expr());
        if (!isParam) {
            SymbolEntry entry = table.getChainTable(leftId);
            entry.setInitialized(true);
            entry.setValue(e.getValue());
        }
        System.out.println(leftId + " = " + e);
        // 赋值语句无法使用 返回void
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitAddExpr(C0Parser.AddExprContext ctx) {
        Expression left = visit(ctx.expr(0));
        String symbol = ctx.op.getText();
        Expression right = visit(ctx.expr(1));
        if (left.getType() == Type.VOID || right.getType() == Type.VOID || left.getType() != right.getType()) {
            throw new RuntimeException("add-type-conflict");
        }
        return VisitorUtil.exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Expression visitMultExpr(C0Parser.MultExprContext ctx) {
        Expression left = visit(ctx.expr(0));
        String symbol = ctx.op.getText();
        Expression right = visit(ctx.expr(1));
        if (left.getType() == Type.VOID || right.getType() == Type.VOID || left.getType() != right.getType()) {
            throw new RuntimeException("mult-type-conflict");
        }
        return VisitorUtil.exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Expression visitBoolExpr(C0Parser.BoolExprContext ctx) {
        Expression left = visit(ctx.expr(0));
        String symbol = ctx.BOOL_OP().getText();
        Expression right = visit(ctx.expr(1));
        if (left.getType() == Type.VOID || right.getType() == Type.VOID || left.getType() != right.getType()) {
            throw new RuntimeException("cmp-type-conflict");
        }
        return VisitorUtil.exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Expression visitAsExpr(C0Parser.AsExprContext ctx) {
        Expression source = visit(ctx.expr());
        Type transTo = Utils.getType(ctx.ty.getText());
        return VisitorUtil.intDoubleTransfer(source, transTo);
    }

    @Override
    public Expression visitNagExpr(C0Parser.NagExprContext ctx) {
        int minusNum = ctx.children.size() - 1;
        Expression expression = visit(ctx.expr());
        return VisitorUtil.nagExpr(expression, minusNum);
    }

    @Override
    public Expression visitParenExpr(C0Parser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Expression visitIdent(C0Parser.IdentContext ctx) {
        boolean isParam;
        FunctionParam param = null;
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        SymbolEntry entry = table.getChainTable(ident);
        if (currentFunc.equals("#start")) {
            isParam = false;
        } else {
            isParam = false;
            //isParam = funcTable.get(currentFunc).getParamMap().get(ident) != null;
            List<FunctionParam> paramList = funcParam.get(currentFunc);
            //System.out.println(currentFunc);
            //System.out.println(paramList);
            //System.out.println(ident);
            if (paramList != null) {
                for (FunctionParam functionParam : paramList) {
                    if (functionParam.getParamName().equals(ident)) {
                        isParam = true;
                        param = functionParam;
                    }
                }
            }
        }
        if (!isParam && entry == null) {
            throw new RuntimeException("use-undeclared-ident");
        } else if (entry != null && !entry.isInitialized()){
            throw new RuntimeException("use-uninitialized-ident");
        } else {
            if (isParam) {
                return new Expression(param.getValue(), param.getType());
            }
            return new Expression(entry.getValue(), entry.getType());
        }
    }

    @Override
    public Expression visitUint(C0Parser.UintContext ctx) {
        String uint = ctx.UINT().getText();
        int value;
        try {
            value = Integer.parseInt(uint);
        } catch (Exception e) {
            value = uint.charAt(0);
        }
        return new Expression(value, Type.INT);
    }

    @Override
    public Expression visitDouble(C0Parser.DoubleContext ctx) {
        String doubleText = ctx.DOUBLE().getText();
        double d = Double.parseDouble(doubleText);
        long l = Double.doubleToRawLongBits(d);
        return new Expression(d, Type.DOUBLE);
    }
}
