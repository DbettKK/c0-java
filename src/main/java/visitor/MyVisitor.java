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
        //
        funcTable.put(funcName, new Function(
                funcName,
                paramMap,
                Utils.getType(ctx.ty.getText()),
                funcOffset++,
                null
        ));
        List<SymbolTable> tableList = new ArrayList<>();
        SymbolTable startTable = symMap.get("#start").get(symMap.get("#start").size() - 1);
        tableList.add(new SymbolTable(startTable, funcName));
        symMap.put(currentFunc, tableList);
        funcFlag = false;
        visit(ctx.blockStmt());
        return null;
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
        for (C0Parser.StmtContext stmtContext : ctx.stmt()) {
            visit(stmtContext);
        }
        return null;
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
        callFuncParam.put(funcName, paramList);

        visit((ParseTree) functionNode);
        //if (funcTable.get(funcName) == null) throw new RuntimeException("call-undeclared-func");
        Function function = funcTable.get(funcName);
        // TODO 执行函数
        if (function.getReturnType() == Type.VOID) {
            return new Expression(0, Type.VOID);
        }
        Map<String, FunctionParam> paramMap = function.getParamMap();
        return VisitorUtil.callFunc();
    }


    @Override
    public Expression visitAssignExpr(C0Parser.AssignExprContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String leftId = ctx.IDENT().getText();
        if (funcTable.get(currentFunc).getParamMap().get(leftId) == null
                && table.getChainTable(leftId) == null) {
            throw new RuntimeException("assign-to-undeclared-ident");
        } else {
            if (table.getChainTable(leftId) != null && table.getChainTable(leftId).isConst()) {
                throw new RuntimeException("assign-to-const-ident");
            } else if (funcTable.get(currentFunc).getParamMap().get(leftId) != null
                    && funcTable.get(currentFunc).getParamMap().get(leftId).isConst()) {
                throw new RuntimeException("assign-to-const-ident");
            }
        }
        Expression e = visit(ctx.expr());

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
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        SymbolEntry entry = table.getChainTable(ident);
        if (currentFunc.equals("#start")) {
            isParam = false;
        } else {
            isParam = funcTable.get(currentFunc).getParamMap().get(ident) != null;
        }
        if (!isParam && entry == null) {
            throw new RuntimeException("use-undeclared-ident");
        } else if (!entry.isInitialized()){
            throw new RuntimeException("use-uninitialized-ident");
        } else {
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
