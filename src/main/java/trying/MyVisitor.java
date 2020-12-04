package trying;

import c0.C0BaseVisitor;
import c0.C0Parser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class MyVisitor extends C0BaseVisitor<Expression> {
    // 在访问过一个函数后 将该函数放入 funcTable
    private static final Map<String, Function> funcTable = new HashMap<>();
    private int funcOffset = 0;
    // functionNodeMap: 在未开始启动时 将所有函数节点放入map中 方便查询
    private static Map<String, FunctionNode> functionNodeMap = new HashMap<>();
    private int nodeOffset = 0;
    // isVisit: 在结束后 如果存在没有访问过的函数 则重新访问进行检查
    private static Map<String, Boolean> isVisit = new HashMap<>();
    // 存放每个函数对应 调用时的实际参数
    private static Map<String, List<Expression>> callFuncParam = new HashMap<>();
    // 存放每个函数的定义的参数
    private static Map<String, List<FunctionParam>> funcParam = new HashMap<>();
    // 存放每个函数的返回值
    private static Map<String, Expression> returnExpression = new HashMap<>();
    private static Stack<Integer> tmpBlock = new Stack<>();
    private static Stack<String> tmpFuncName = new Stack<>();
    private static Stack<Map<String, List<FunctionParam>>> tmpFuncParamStack = new Stack<>();
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
                isVisit.put(funcName, false);
            }
        }
        callFuncParam.put("main", new ArrayList<>());
        for (ParseTree child : children) {
            if (child instanceof C0Parser.FunctionContext) {
                String funcName = ((C0Parser.FunctionContext) child).IDENT().getText();
                if (funcName.equals("main")) {
                    visit(child);
                    isVisit.put(funcName, true);
                }
            } else {
                visit(child);
            }
        }
        for (String s : isVisit.keySet()) {
            if (!isVisit.get(s) && !s.equals("main")) {
                visitFuncToCheckType(functionNodeMap.get(s).getFunctionContext());
            }
        }

        return null;
    }

    @Override
    public Expression visitLetDeclStmt(C0Parser.LetDeclStmtContext ctx) {
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String ident = ctx.IDENT().getText();
        if (table.getCurTable(ident) != null) {
            throw new RuntimeException("duplicate-assign-in-one-bloack");
        }
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
        if (table.getCurTable(ident) != null) {
            throw new RuntimeException("duplicate-assign-in-one-bloack");
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
        //System.out.println(funcName);
        if (funcName.equals("main")) {
            funcTable.put("main", new Function(
                    "main",
                    new HashMap<>(),
                    Utils.getType(ctx.ty.getText()),
                    funcOffset++,
                    0
            ));
        }
        /*if (funcTable.get(funcName) != null) {
            throw new RuntimeException("duplicated-func-name");
        }*/
        currentFunc = funcName;
        isVisit.put(funcName, true);
        int actualParamNum, declareParamNum = 0;
        // 取得调用当前函数的实际参数列表
        List<Expression> actualParamList = callFuncParam.get(funcName);
        actualParamNum = actualParamList.size();
        // 顺序存放该函数定义的所有的参数的类型
        List<Type> declareParamList = new ArrayList<>();
        Map<String, FunctionParam> paramMap = new HashMap<>();

        if (ctx.functionParamList() != null) {
            // 遍历该函数的定义参数列表 并将其放入declareParamList
            List<C0Parser.FunctionParamContext> paramList = ctx.functionParamList().functionParam();
            // 取得定义的参数个数和参数类型
            declareParamNum = paramList.size();
            for (C0Parser.FunctionParamContext param : paramList) {
                declareParamList.add(Utils.getType(param.ty.getText()));
            }
        }
        // 对参数个数和参数类型分别进行判断
        if (actualParamNum != declareParamNum) {
            throw new RuntimeException("param-num-error");
        }
        for (int i = 0; i < actualParamNum; i++) {
            if (actualParamList.get(i).getType() != declareParamList.get(i))
                throw new RuntimeException("param-type-error");
        }

        if (ctx.functionParamList() != null) {
            // 参数没问题后 将每个实际参数分别放入对应定义的参数中
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

        // paramMap构造完成

        // 新建该函数对应的符号表列表
        List<SymbolTable> tableList = new ArrayList<>();
        // 获取最外层符号表
        SymbolTable startTable = symMap.get("#start").get(symMap.get("#start").size() - 1);
        // 新建该函数下对应的第一个符号表并放入列表第一位
        tableList.add(new SymbolTable(startTable, funcName));
        // 将建好的符号表放入总map中
        symMap.put(currentFunc, tableList);

        funcFlag = false;
        currentBlock = 0;
        funcParam.clear();
        // 将paramMap中的所有param取出 放入列表中 存到funcParam
        List<FunctionParam> paramList = new ArrayList<>();
        for (String s : paramMap.keySet()) {
            paramList.add(paramMap.get(s));
        }
        funcParam.put(funcName, paramList);

        //currentBlock = 0;
        //Map<String, List<FunctionParam>> tmpMapParam = funcParam;
        //String tmp = currentFunc;
        //System.out.println("cur Func->" + currentFunc);
        //System.out.println("-----Enter->" + funcName);
        //System.out.println(funcParam);
        Expression visit = visit(ctx.blockStmt());
        if (funcName.equals("main")) {
            if (visit!=null&& visit.getType() != Utils.getType(ctx.ty.getText())) {
                throw new RuntimeException();
            }
        }


        Expression returnExpresstion = returnExpression.get(funcName);
        if (returnExpresstion == null) {
            returnExpresstion  = new Expression(0, Type.VOID);
        }
        //currentBlock = tmpBlock;
        //System.out.println("####stack" + tmpFuncParamStack);
        if(!tmpFuncParamStack.isEmpty())
            funcParam = tmpFuncParamStack.pop();
        //System.out.println("func exit->" + funcName);
        //System.out.println("cur Func->" + currentFunc);
        //System.out.println("cur funcParam" + funcParam);
        //System.out.println(funcParam);
        //currentFunc = tmp;
        //funcParam = tmpMapParam;
        Type actualReturnType = returnExpresstion.getType();
        /*if (actualReturnType != Utils.getType(ctx.ty.getText())){
            System.out.println(returnExpresstion);
            throw new RuntimeException("return-type-error");
        }*/

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
    public Expression visitCallFunc(C0Parser.CallFuncContext ctx) {
        String funcName = ctx.IDENT().getText();
        FunctionNode functionNode = functionNodeMap.get(funcName);
        //System.out.println("---------------");
        //System.out.println("cur func->" + currentFunc);
        //System.out.println("call func->" + funcName);
        if (functionNode == null) throw new RuntimeException("call-undeclared-func");
        // 添加实际参数
        List<Expression> paramList = new ArrayList<>();

        for (ParseTree child : ctx.children) {
            if (child instanceof C0Parser.ExprContext) {
                // TODO here
                //System.out.println(currentFunc + "-" +funcParam);
                Expression param = visit(child);
                paramList.add(param);
            }
        }
        tmpBlock.push(currentBlock);
        callFuncParam.put(funcName, paramList);
        tmpFuncName.push(currentFunc);
        Map<String, List<FunctionParam>> newFuncParam = new HashMap<>(funcParam);
        tmpFuncParamStack.push(newFuncParam);
        //System.out.println("stored->" + newFuncParam);
        visit(functionNode.getFunctionContext());
        Expression returnExpression = this.returnExpression.get(funcName);
        System.out.println(returnExpression);
        if (returnExpression == null) {
            if (funcTable.get(funcName).getReturnType() != Type.VOID) {
                throw new RuntimeException("func-no-return");
            }
        }
        if (returnExpression != null) {
            /*if (funcTable.get(funcName).getReturnType() != returnExpression.getValue()) {
                throw new RuntimeException("");
            }*/
            funcTable.get(funcName).setReturnValue(returnExpression.getValue());
        }

        //System.out.println(this.returnExpression.get(funcName));
        currentFunc = tmpFuncName.pop();
        currentBlock = tmpBlock.pop();
        //System.out.println(currentBlock);
        //System.out.println("cur->" + tmpBlock);
        /*callFuncParam = tmpMap;
        funcParam = tmpMapParam;*/
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
    public Expression visitWhileStmt(C0Parser.WhileStmtContext ctx) {
        // break or continue
        //System.out.println("enter");
        Expression e = visit(ctx.expr());
        boolean condition = VisitorUtil.getCondition(e);
        //System.out.println(condition);
        while (condition) {

            //System.out.println(currentBlock);
           Expression visit = visit(ctx.blockStmt());
           if (visit != null) return visit;
            List<SymbolTable> tableList = symMap.get(currentFunc);
            for (int i = currentBlock + 1 ; i < tableList.size() ; i++){
                tableList.remove(i);
            }

            //System.out.println(currentBlock);
            e = visit(ctx.expr());
            condition = VisitorUtil.getCondition(e);
        }
        return null;
    }

    @Override
    public Expression visitIfStmt(C0Parser.IfStmtContext ctx) {
        Expression e = visit(ctx.expr());
        boolean condition = VisitorUtil.getCondition(e);
        if (condition) {
            return visit(ctx.blockStmt());
        } else {
           if (ctx.elseStmt() != null) {
               visit(ctx.elseStmt());
           }
        }
        return null;
    }

    @Override
    public Expression visitElseStmt(C0Parser.ElseStmtContext ctx) {
        if (ctx.ifStmt() != null) {
            return visit(ctx.ifStmt());
        } else {
            return visit(ctx.blockStmt());
        }
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

        /*List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = new SymbolTable(tableList.get(tableList.size() - 1), currentFunc);
        tableList.add(table);
        currentBlock++;*/
        Expression returnExpresstion = null;
        for (C0Parser.StmtContext stmtContext : ctx.stmt()) {
            if (stmtContext.returnStmt() != null) {
                System.out.println("------return");
                returnExpresstion = visit(stmtContext);
                System.out.println("return->"+returnExpresstion);
                returnExpression.put(currentFunc, returnExpresstion);
                return returnExpresstion;
            }
            else {
                Expression visit = visit(stmtContext);
                if (visit!=null) return visit;
            }
        }

        //SymbolTable table = new SymbolTable(tableList.get(tableList.size() - 1), currentFunc);
        if (currentBlock > 0) currentBlock--;

        if (returnExpresstion == null && returnExpression.get(currentFunc) == null) {
            return null;
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
    public Expression visitGetInt(C0Parser.GetIntContext ctx) {
        return new Expression(5, Type.INT);
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
        System.out.print("putint: "+e);
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutDouble(C0Parser.PutDoubleContext ctx) {
        Expression e = visit(ctx.expr());
        if (e.getType() != Type.DOUBLE) {
            throw new RuntimeException("putdouble-not-double");
        }
        System.out.print("putdouble: "+e.getValue());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutChar(C0Parser.PutCharContext ctx) {
        Expression e;
        if (ctx.Char() != null) {
            int value = ctx.Char().getText().charAt(0);
            e = new Expression(value, Type.INT);
        } else if (ctx.UINT() != null) {
            int value = Integer.parseInt(ctx.UINT().getText());
            e = new Expression(value, Type.INT);
        } else  e = visit(ctx.expr());
        if (e.getType() != Type.INT) {
            throw new RuntimeException("putchar-not-char");
        }
        System.out.print("putchar: "+e.getValue());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutStr(C0Parser.PutStrContext ctx) {
        System.out.print("putstr: "+ctx.str().getText());
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitPutLn(C0Parser.PutLnContext ctx) {
        System.out.println("");
        return new Expression(0, Type.VOID);
    }

    @Override
    public Expression visitAssignExpr(C0Parser.AssignExprContext ctx) {
        boolean isParam = false, isConst = false;
        List<SymbolTable> tableList = symMap.get(currentFunc);
        SymbolTable table = tableList.get(currentBlock);
        String leftId = ctx.IDENT().getText();
        //if (funcTable.get(currentFunc).getParamMap() != null)
        //System.out.println(funcTable);
        //System.out.println(currentFunc);
        List<FunctionParam> params = funcParam.get(currentFunc);
        if (params != null) {
            for (FunctionParam param : params) {
                if (param.getParamName().equals(leftId)) {
                    isParam = true;
                    isConst = param.isConst();
                    break;
                }
            }
        }
        if (!isParam && table.getChainTable(leftId) == null) {
            throw new RuntimeException("assign-to-undeclared-ident");
        } else {
            if (table.getChainTable(leftId) != null && table.getChainTable(leftId).isConst()) {
                throw new RuntimeException("assign-to-const-ident");
            } else if (isParam && isConst) {
                throw new RuntimeException("assign-to-const-ident");
            }
        }
        Expression e = visit(ctx.expr());
        // TODO judge
        if (e.getType() == Type.VOID) {
            throw new RuntimeException("assign-void");
        }
        if (!isParam) {
            SymbolEntry entry = table.getChainTable(leftId);
            entry.setInitialized(true);
            entry.setValue(e.getValue());
        } else {
            List<FunctionParam> paramList = funcParam.get(currentFunc);
            for (FunctionParam param : paramList) {
                if (param.getParamName().equals(leftId)) {
                    param.setValue(e.getValue());
                }
            }
        }
        //System.out.println(leftId + " = " + e);
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
        System.out.println(left);
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
        //System.out.println(ctx.IDENT().getText());
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
        } else if (entry != null && !entry.isInitialized()) {
            //System.out.println(table);
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

    @Override
    public Expression visitExprStmt(C0Parser.ExprStmtContext ctx) {
        visit(ctx.expr());
        return null;
    }

    public void visitFuncToCheckType(C0Parser.FunctionContext ctx) {
        // TODO
        String funcName = ctx.IDENT().getText();
        //System.out.println(funcName);
        Type returnType = Utils.getType(ctx.ty.getText());
        Type actualType = Type.VOID;
        List<C0Parser.StmtContext> stmtList = ctx.blockStmt().stmt();
        boolean is = false;
        for (C0Parser.StmtContext stmtContext : stmtList) {
            if (stmtContext.returnStmt() != null) {
                try {
                    //System.out.println(stmtContext.returnStmt().expr().getText());
                    is = true;
                    actualType = visit(stmtContext.returnStmt().expr()).getType();
                } catch (Exception e) {
                    return;
                }

            }
        }
        if (returnType != actualType && is) {
            //System.out.println(actualType);
            throw new RuntimeException("return-type-error");
        }
    }
}
