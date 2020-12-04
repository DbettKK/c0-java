package visitor;

import c0.C0BaseVisitor;
import c0.C0Parser;
import listener.utils.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.*;

public class YourVisitor extends C0BaseVisitor<Type> {
    //Queue<Instruction> currentQueue = new ArrayDeque<>();
    //SymbolTable table = new SymbolTable(null, "");
    InstructionQueue currentQueue;
    SymbolTable currentTable;
    Function currentFunction;
    public static Map<String, Function> funcTable = new HashMap<>();
    int funcOffset = 0;
    Map<String, Type> returnMap = new HashMap<>();
    boolean isFuncBlock, isBreak, isContinue;
    Stack<Integer> brStack = new Stack<>();
    Stack<Integer> contStack = new Stack<>();
    Stack<Boolean> isContStack = new Stack<>();
    Stack<Boolean> isBrStack = new Stack<>();
    int breakIndex = -1, continueIndex = -1;
    public static List<Global> global = new ArrayList<>();
    boolean isVoid = false;



    int currentWhile = 0;
    Map<Integer, Integer> whileBreakMap = new HashMap<>();
    Map<Integer, Integer> whileContMap = new HashMap<>();
    @Override
    public Type visitProgram(C0Parser.ProgramContext ctx) {
        // 新建总符号表
        global.add(new Global("_start", GlobalType.FUNCTION));
        currentTable = new SymbolTable(null);
        // 新建_start函数
        Function _start = new Function("_start", new ArrayList<>(), Type.VOID, funcOffset++);
        funcTable.put("_start", _start);
        currentFunction = _start;
        currentQueue = _start.getInstructions();

        for (ParseTree child : ctx.children) {
            visit(child);
        }

        InstructionQueue startQueue = funcTable.get("_start").getInstructions();
        Function main = funcTable.get("main");
        int v = main.getReturnType() == Type.VOID ? 0 : 1;
        startQueue.add(new Instruction(InstructionEnum.STACKALLOC, v));
        startQueue.add(new Instruction(InstructionEnum.CALL, main.getOffset()));

        List<Global> newGlobal = new ArrayList<>();
        for (Global g : global) {
            if (g.getType() == GlobalType.VAR || g.getType() == GlobalType.CONST) {
                newGlobal.add(g);
            }
        }
        for (Global g : global) {
            if (g.getType() == GlobalType.FUNCTION) {
                newGlobal.add(g);
            }
        }
        for (Global g : global) {
            if (g.getType() == GlobalType.STRING) {
                newGlobal.add(g);
            }
        }
        global = newGlobal;

        /*for (String s : funcTable.keySet()) {
            System.out.println("FUNC: " + s);
            InstructionQueue instructions = funcTable.get(s).getInstructions();
            while (!instructions.isEmpty()) {
                System.out.println(instructions.poll());
            }
            System.out.println("----------------------------");
        }*/
        return Type.VOID;
    }

    @Override
    public Type visitFunction(C0Parser.FunctionContext ctx) {
        isVoid = false;
        String funcName = ctx.IDENT().getText();
        global.add(new Global(funcName, GlobalType.FUNCTION));
        Type decType = Utils.getType(ctx.ty.getText());
        if (funcTable.get(funcName) != null) {
            throw new RuntimeException("duplicated-func-declare");
        }
        Function newFunction = new Function(funcName, new ArrayList<>(), decType, funcOffset++);

        funcTable.put(funcName, newFunction);

        //InstructionQueue tmpQueue = (InstructionQueue) deepClone(currentQueue);
        String tmp = currentFunction.getFuncName();
        currentFunction = newFunction;
        // 新建符号表 且将flag置为true
        currentTable = new SymbolTable(currentTable);
        currentQueue = currentFunction.getInstructions();
        if (newFunction.getReturnType()!=Type.VOID) {
            //System.out.println(currentFunction.getFuncName());
            //currentQueue.add(new Instruction(InstructionEnum.ARGA, 0));
            isVoid = true;
        }
        isFuncBlock = true;
        if (ctx.functionParamList() != null) {
            visit(ctx.functionParamList());
        } else {
            currentFunction.setParamList(new ArrayList<>());
        }

        visit(ctx.blockStmt());
        if (!currentQueue.isEmpty() && currentQueue.peekLast().getInstruction() != InstructionEnum.RET) {
            if (currentFunction.getReturnType() != Type.VOID) {
                throw new RuntimeException("all-need-return");
            }
        }
        if (returnMap.get(funcName) == null) {
            // 没有return 先检查返回类型
            if (newFunction.getReturnType() != Type.VOID) {
                throw new RuntimeException("return-type-conflict");
            }
            returnMap.put(funcName, Type.VOID);
            currentQueue.add(new Instruction(InstructionEnum.RET, null));
        } else {
            if (newFunction.getReturnType() == Type.VOID) {
                if (currentQueue.peekLast().getInstruction()!=InstructionEnum.RET) {
                    returnMap.put(funcName, Type.VOID);
                    currentQueue.add(new Instruction(InstructionEnum.RET, null));
                }

            }
        }
        currentFunction = funcTable.get(tmp);
        currentQueue = currentFunction.getInstructions();
        //funcTable.get("_start").setInstructions(currentQueue);
        return Type.VOID;
    }

    @Override
    public Type visitFunctionParamList(C0Parser.FunctionParamListContext ctx) {
        List<C0Parser.FunctionParamContext> paramList = ctx.functionParam();
        List<FunctionParam> functionParamList = new ArrayList<>();
        int paramOffset = 0;
        for (C0Parser.FunctionParamContext param : paramList) {
            boolean isConst = false;
            if (param.isConst != null) isConst = true;
            String paramName = param.IDENT().getText();
            Type paramType = Utils.getType(param.ty.getText());
            functionParamList.add(new FunctionParam(isConst, paramName, paramType, paramOffset++));
            currentTable.put(paramName, new SymbolEntry(isConst, true, false,
                    false, currentTable.getOffset(), paramType));
        }
        currentFunction.setParamList(functionParamList);
        return Type.VOID;
    }

    @Override
    public Type visitCallFunc(C0Parser.CallFuncContext ctx) {
        String callName = ctx.IDENT().getText();
        Function callFunction = funcTable.get(callName);
        currentQueue.add(new Instruction(InstructionEnum.STACKALLOC,
                callFunction.getReturnType() == Type.VOID ? 0 : 1));
        List<C0Parser.ExprContext> callParamList = ctx.expr();
        if (callParamList.size() != callFunction.getParamList().size()) {
            throw new RuntimeException("error-param-num");
        }
        for (int i = 0; i < callParamList.size(); i++) {
            Type callParamType = visit(callParamList.get(i));
            Type decParamType = callFunction.getParamList().get(i).getType();
            if (callParamType != decParamType) {
                throw new RuntimeException("error-param-type");
            }

        }
        currentQueue.add(new Instruction(InstructionEnum.CALL, callFunction.getOffset()));

        return callFunction.getReturnType();
    }

    @Override
    public Type visitIfStmt(C0Parser.IfStmtContext ctx) {
        visit(ctx.expr());
        currentQueue.add(new Instruction(InstructionEnum.BRTRUE, 1));
        currentQueue.add(new Instruction(InstructionEnum.BR, 0));
        int index = currentQueue.getIndex();
        //System.out.println(index);
        visit(ctx.blockStmt());
        //System.out.println(index);
        int add = ctx.elseStmt()!=null ? 1 : 0;
        currentQueue.change(index,
                new Instruction(InstructionEnum.BR, currentQueue.size() - index + add));
        if (ctx.elseStmt() != null) {
            currentQueue.add(new Instruction(InstructionEnum.BR, 0));
            int index1 = currentQueue.getIndex();
            System.out.println(index1);
            if (ctx.elseStmt().ifStmt() != null) {
                visit(ctx.elseStmt().ifStmt());
            }else if (ctx.elseStmt().blockStmt() != null) {
                visit(ctx.elseStmt().blockStmt());
            }
            System.out.println(index1);
            currentQueue.change(index1,
                    new Instruction(InstructionEnum.BR, currentQueue.size() - index1));
        }
        // 这一步应该是不需要的
        //currentQueue.add(new Instruction(InstructionEnum.BR, 0));
        return Type.VOID;
    }

    @Override
    public Type visitElseStmt(C0Parser.ElseStmtContext ctx) {

        return Type.VOID;
    }

    @Override
    public Type visitWhileStmt(C0Parser.WhileStmtContext ctx) {
        currentWhile++;
        whileBreakMap.put(currentWhile, 0);
        whileContMap.put(currentWhile, 0);
        isBrStack.push(false);
        isContStack.push(false);
        //currentQueue.add(new Instruction(InstructionEnum.BR, 0));
        int indexInit = currentQueue.getIndex();
        visit(ctx.expr());
        currentQueue.add(new Instruction(InstructionEnum.BRTRUE, 1));
        currentQueue.add(new Instruction(InstructionEnum.BR, 0));
        int index = currentQueue.getIndex();

        visit(ctx.blockStmt());

        currentWhile--;
        int breakNum = whileBreakMap.get(currentWhile+1);
        int contNum = whileContMap.get(currentWhile+1);
        whileBreakMap.put(currentWhile+1, 0);
        whileContMap.put(currentWhile+1, 0);
        if (isBrStack.pop()) {
            //System.out.println(breakIndex);
            //System.out.println(currentQueue.size());
            for (int i = 0; i < breakNum; i++) {
                breakIndex = brStack.pop();
                currentQueue.change(breakIndex,
                        new Instruction(InstructionEnum.BR, currentQueue.size() - breakIndex + 1));
                breakIndex = -1;
            }
        }
        if (isContStack.pop()) {
            for (int i = 0; i < contNum; i++) {
                continueIndex = contStack.pop();
                currentQueue.change(continueIndex,
                        new Instruction(InstructionEnum.BR, indexInit - continueIndex));
                continueIndex = -1;
            }
        }

        currentQueue.change(index,
                new Instruction(InstructionEnum.BR, currentQueue.size() - index + 1));
        currentQueue.add(new Instruction(InstructionEnum.BR, indexInit - currentQueue.size() - 1));
        return Type.VOID;
    }

    @Override
    public Type visitBlockStmt(C0Parser.BlockStmtContext ctx) {
        if (isFuncBlock) {
            isFuncBlock = false;
        } else {
            currentTable = new SymbolTable(currentTable);
        }
        List<C0Parser.StmtContext> statements = ctx.stmt();
        for (C0Parser.StmtContext statement : statements) {
            if (statement.breakStmt() != null) {
                isBrStack.pop();
                isBrStack.push(true);
                currentQueue.add(new Instruction(InstructionEnum.BR, 0));
                breakIndex = currentQueue.getIndex();
                brStack.push(breakIndex);
                whileBreakMap.put(currentWhile, whileBreakMap.get(currentWhile)+1);
            } else if (statement.continueStmt() != null) {
                isContStack.pop();
                isContStack.push(true);
                currentQueue.add(new Instruction(InstructionEnum.BR, 0));
                continueIndex = currentQueue.getIndex();
                contStack.push(continueIndex);
                whileContMap.put(currentWhile, whileContMap.get(currentWhile)+1);
            }
            visit(statement);
        }
        currentTable = currentTable.getPrevTable();
        return Type.VOID;
    }

    @Override
    public Type visitReturnStmt(C0Parser.ReturnStmtContext ctx) {
        Type returnType = Type.VOID;
        Type decType = currentFunction.getReturnType();
        if (decType != Type.VOID) {
            currentQueue.add(new Instruction(InstructionEnum.ARGA, 0));
        }
        if (ctx.expr() != null) {
            returnType = visit(ctx.expr());
            currentQueue.add(new Instruction(InstructionEnum.STORE64, null));
        }

        if (decType != returnType) {
            throw new RuntimeException("return-type-conflic");
        }
        returnMap.put(currentFunction.getFuncName(), returnType);
        currentQueue.add(new Instruction(InstructionEnum.RET, null));
        return Type.VOID;
    }

    @Override
    public Type visitLetDeclStmt(C0Parser.LetDeclStmtContext ctx) {
        boolean isGlobal = currentTable.getPrevTable() == null;
        int localVarOffset = 0;
        String ident = ctx.IDENT().getText();
        if (isGlobal) {
            if (ctx.ASSIGN() != null) {
                funcTable.get("_start").getInstructions()
                    .add(new Instruction(InstructionEnum.GLOBA, currentTable.getOffset()));
            }
        } else {
            localVarOffset = currentFunction.getLocalVarOffset();
            currentFunction.setLocalVarOffset(localVarOffset + 1);
            currentFunction.setLocSlot(currentFunction.getLocSlot() + 1);
            if (ctx.ASSIGN() != null) {
                currentQueue.add(new Instruction(InstructionEnum.LOCA, localVarOffset));
            }
        }
        if (currentTable.getCurTable(ident) != null) {
            throw new RuntimeException("duplicated-let-declare");
        }
        if (ctx.ASSIGN() == null) {
            SymbolEntry entry = new SymbolEntry(false, false, isGlobal, !isGlobal,
                    currentTable.getOffset(), Utils.getType(ctx.ty.getText()));
            if (!isGlobal) entry.setLocalVarOffset(localVarOffset);
            currentTable.put(ident, entry);

        } else {
            Type let = visit(ctx.expr());
            if (let != Utils.getType(ctx.ty.getText()))
                throw new RuntimeException("let-declare-type-conflict");
            SymbolEntry entry = new SymbolEntry(false, false, isGlobal, !isGlobal,
                    currentTable.getOffset(), Utils.getType(ctx.ty.getText()));
            if (!isGlobal) entry.setLocalVarOffset(localVarOffset);
            currentTable.put(ident, entry);
            currentQueue.add(new Instruction(InstructionEnum.STORE64, null));
        }
        if (isGlobal) global.add(new Global(ident, GlobalType.VAR));
        return Type.VOID;
    }

    @Override
    public Type visitConstDeclStmt(C0Parser.ConstDeclStmtContext ctx) {
        boolean isGlobal = currentTable.getPrevTable() == null;
        String ident = ctx.IDENT().getText();
        int localVarOffset = 0;
        if (isGlobal) {
            funcTable.get("_start").getInstructions()
                    .add(new Instruction(InstructionEnum.GLOBA, currentTable.getOffset()));
        } else {
            localVarOffset = currentFunction.getLocalVarOffset();
            currentFunction.setLocalVarOffset(localVarOffset + 1);
            currentFunction.setLocSlot(currentFunction.getLocSlot() + 1);
            currentQueue.add(new Instruction(InstructionEnum.LOCA, localVarOffset));
        }
        if (currentTable.getCurTable(ident) != null) {
            throw new RuntimeException("duplicated-const-declare");
        }
        Type constVar = visit(ctx.expr());
        if (constVar != Utils.getType(ctx.ty.getText()))
            throw new RuntimeException("const-declare-type-conflict");

        SymbolEntry entry = new SymbolEntry(true, false, isGlobal, !isGlobal,
                currentTable.getOffset(), Utils.getType(ctx.ty.getText()));
        if (!isGlobal) entry.setLocalVarOffset(localVarOffset);
        currentTable.put(ident, entry);
        currentQueue.add(new Instruction(InstructionEnum.STORE64, null));
        if (isGlobal) global.add(new Global(ident, GlobalType.CONST));
        return Type.VOID;
    }

    @Override
    public Type visitParenExpr(C0Parser.ParenExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Type visitNagExpr(C0Parser.NagExprContext ctx) {
        int minusNum = ctx.children.size() - 1;
        Type type = visit(ctx.expr());
        InstructionEnum instruction = type == Type.DOUBLE ? InstructionEnum.NEGF : InstructionEnum.NEGI;
        for (int i = 0; i < minusNum; i++) {
            currentQueue.add(new Instruction(instruction, null));
        }
        return type;
    }

    @Override
    public Type visitAssignExpr(C0Parser.AssignExprContext ctx) {
        String ident = ctx.IDENT().getText();
        SymbolEntry entry = currentTable.getChainTable(ident);
        if (entry == null) {
            throw new RuntimeException("assign-to-undeclared-ident");
        }
        identLeftSpecify(ident, entry);
        Type type = visit(ctx.expr());
        if (entry.getType() != type) {
            throw new RuntimeException("assign-type-conflict");
        } else if (entry.isConst()) {
            throw new RuntimeException("assign-to-const");
        }

        currentQueue.add(new Instruction(InstructionEnum.STORE64, null));
        return Type.VOID;
    }

    @Override
    public Type visitAsExpr(C0Parser.AsExprContext ctx) {
        Type source = visit(ctx.expr());
        Type transTo = Utils.getType(ctx.ty.getText());
        return intDoubleTransfer(source, transTo);
    }

    @Override
    public Type visitAddExpr(C0Parser.AddExprContext ctx) {
        Type left = visit(ctx.expr(0));
        String symbol = ctx.op.getText();
        Type right = visit(ctx.expr(1));
        if (right == Type.VOID || left != right) {
            throw new RuntimeException("add-type-conflict");
        }
        return exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Type visitMultExpr(C0Parser.MultExprContext ctx) {
        Type left = visit(ctx.expr(0));
        String symbol = ctx.op.getText();
        Type right = visit(ctx.expr(1));
        if (right == Type.VOID || left != right) {
            throw new RuntimeException("mult-type-conflict");
        }
        return exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Type visitBoolExpr(C0Parser.BoolExprContext ctx) {
        Type left = visit(ctx.expr(0));
        String symbol = ctx.BOOL_OP().getText();
        Type right = visit(ctx.expr(1));
        if (right == Type.VOID || left != right) {
            throw new RuntimeException("cmp-type-conflict");
        }
        return exprSymbolExpr(left, symbol, right);
    }

    @Override
    public Type visitIdent(C0Parser.IdentContext ctx) {
        String ident = ctx.IDENT().getText();
        SymbolEntry entry = currentTable.getChainTable(ident);
        if (entry == null) {
            throw new RuntimeException("use-undeclared-ident");
        }
        identSpecify(ident, entry);
        return entry.getType();
    }

    @Override
    public Type visitChar(C0Parser.CharContext ctx) {
        String c = ctx.getText();
        c = StringEscapeUtils.unescapeJava(c);
        int value = c.charAt(1);
        //System.out.println(value);
        currentQueue.add(new Instruction(InstructionEnum.PUSH, value));
        return Type.INT;
    }

    @Override
    public Type visitUint(C0Parser.UintContext ctx) {
        long value;
        try {
            value = Long.parseLong(ctx.UINT().getText());
        } catch (Exception e) {
            value = ctx.UINT().getText().charAt(0);
        }
        currentQueue.add(new Instruction(InstructionEnum.PUSH, value));
        return Type.INT;
    }

    @Override
    public Type visitDouble(C0Parser.DoubleContext ctx) {
        String doubleText = ctx.DOUBLE().getText();
        double d = Double.parseDouble(doubleText);
        long l = Double.doubleToRawLongBits(d);
        currentQueue.add(new Instruction(InstructionEnum.PUSH, l));
        return Type.DOUBLE;
    }

    @Override
    public Type visitExprStmt(C0Parser.ExprStmtContext ctx) {
        visit(ctx.expr());
        return Type.VOID;
    }

    @Override
    public Type visitFuncLabelExpr(C0Parser.FuncLabelExprContext ctx) {
        return visit(ctx.funcExpr());
    }

    @Override
    public Type visitFuncExpr(C0Parser.FuncExprContext ctx) {
        if (ctx.callFunc() != null) return visit(ctx.callFunc());
        return visit(ctx.callStdlib());
    }

    public Type exprSymbolExpr(Type left, String symbol, Type right) {
        InstructionEnum instructionEnum;
        switch (symbol) {
            case "+":
                instructionEnum = left == Type.INT ? InstructionEnum.ADDI : InstructionEnum.ADDF;
                currentQueue.add(new Instruction(instructionEnum, null));
                return left;
            case "-":
                instructionEnum = left == Type.INT ? InstructionEnum.SUBI : InstructionEnum.SUBF;
                currentQueue.add(new Instruction(instructionEnum, null));
                return left;
            case "*":
                instructionEnum = left == Type.INT ? InstructionEnum.MULI : InstructionEnum.MULF;
                currentQueue.add(new Instruction(instructionEnum, null));
                return left;
            case "/":
                instructionEnum = left == Type.INT ? InstructionEnum.DIVI : InstructionEnum.DIVF;
                currentQueue.add(new Instruction(instructionEnum, null));
                return left;
            case ">":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                currentQueue.add(new Instruction(InstructionEnum.SETGT, null));
                return Type.VOID;
            case "<":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                currentQueue.add(new Instruction(InstructionEnum.SETLT, null));
                return Type.VOID;
            case ">=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                currentQueue.add(new Instruction(InstructionEnum.SETLT, null));
                currentQueue.add(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "<=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                currentQueue.add(new Instruction(InstructionEnum.SETGT, null));
                currentQueue.add(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "==":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                currentQueue.add(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "!=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                currentQueue.add(new Instruction(instructionEnum, null));
                return Type.VOID;
        }
        return Type.VOID;
    }

    public Type intDoubleTransfer(Type source, Type transferTo) {
        if (source == Type.VOID) {
            throw new RuntimeException("as-from-void");
        }
        if (source == transferTo) {
            return source;
        } else {
            if (transferTo == Type.INT) {
                currentQueue.add(new Instruction(InstructionEnum.FTOI, null));
                return transferTo;
            } else if (transferTo == Type.DOUBLE) {
                currentQueue.add(new Instruction(InstructionEnum.ITOF, null));
                return transferTo;
            }
        }
        return Type.VOID;
    }

    public void identSpecify(String ident, SymbolEntry entry) {
        //System.out.println(currentFunction.getFuncName());
        if (entry.isGlobal()) {
            currentQueue.add(new Instruction(InstructionEnum.GLOBA, entry.getStackOffset()));
            currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        } else if (entry.isLocal()) {
            currentQueue.add(new Instruction(InstructionEnum.LOCA,
                    entry.getLocalVarOffset()));
            currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        } else if (entry.isParam()) {
            List<FunctionParam> paramList = currentFunction.getParamList();
            int locOffset = -1;
            for (int i = 0; i < paramList.size(); i++) {
                if (paramList.get(i).getParamName().equals(ident)) {
                    locOffset = i;
                }
            }
            if (locOffset == -1) throw new RuntimeException("locOffset-error");
            currentQueue.add(new Instruction(InstructionEnum.ARGA,
                    !isVoid ? locOffset : locOffset + 1));
            currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        }
    }

    public void identLeftSpecify(String ident, SymbolEntry entry) {
        //System.out.println(currentFunction.getFuncName());
        if (entry.isGlobal()) {
            currentQueue.add(new Instruction(InstructionEnum.GLOBA, entry.getStackOffset()));
            //currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        } else if (entry.isLocal()) {
            currentQueue.add(new Instruction(InstructionEnum.LOCA,
                    entry.getLocalVarOffset()));
            //currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        } else if (entry.isParam()) {
            List<FunctionParam> paramList = currentFunction.getParamList();
            int locOffset = -1;
            for (int i = 0; i < paramList.size(); i++) {
                if (paramList.get(i).getParamName().equals(ident)) {
                    locOffset = i;
                }
            }
            if (locOffset == -1) throw new RuntimeException("locOffset-error");
            currentQueue.add(new Instruction(InstructionEnum.ARGA,
                    !isVoid ? locOffset : locOffset + 1));
            //currentQueue.add(new Instruction(InstructionEnum.LOAD64, null));
        }
    }

    @Override
    public Type visitGetInt(C0Parser.GetIntContext ctx) {
        currentQueue.add(new Instruction(InstructionEnum.SCANI, null));
        return Type.INT;
    }

    @Override
    public Type visitGetChar(C0Parser.GetCharContext ctx) {
        currentQueue.add(new Instruction(InstructionEnum.SCANC, null));
        return Type.INT;
    }

    @Override
    public Type visitGetDouble(C0Parser.GetDoubleContext ctx) {
        currentQueue.add(new Instruction(InstructionEnum.SCANF, null));
        return Type.DOUBLE;
    }

    @Override
    public Type visitPutInt(C0Parser.PutIntContext ctx) {
        Type type = visit(ctx.expr());
        if (type != Type.INT) {
            throw new RuntimeException("putInt-error");
        }
        currentQueue.add(new Instruction(InstructionEnum.PRINTI, null));
        return Type.VOID;
    }

    @Override
    public Type visitPutDouble(C0Parser.PutDoubleContext ctx) {
        Type type = visit(ctx.expr());
        if (type != Type.DOUBLE) {
            throw new RuntimeException("putDouble-error");
        }
        currentQueue.add(new Instruction(InstructionEnum.PRINTF, null));
        return Type.VOID;
    }

    @Override
    public Type visitPutChar(C0Parser.PutCharContext ctx) {
        if (ctx.Char() != null) {
            int value = ctx.Char().getText().charAt(1);
            currentQueue.add(new Instruction(InstructionEnum.PUSH, value));
        } else if (ctx.UINT() != null) {
            int value;
            try {
                value = Integer.parseInt(ctx.UINT().getText());
            } catch (Exception e) {
                value = ctx.UINT().getText().charAt(0);
            }
            currentQueue.add(new Instruction(InstructionEnum.PUSH, value));
        } else  {
            Type type = visit(ctx.expr());
            if (type != Type.INT) {
                throw new RuntimeException("putChar-error");
            }
        }
        currentQueue.add(new Instruction(InstructionEnum.PRINTC, null));
        return Type.VOID;
    }

    @Override
    public Type visitPutStr(C0Parser.PutStrContext ctx) {
        String str = ctx.str().getText();
        System.out.println(str);
        global.add(new Global(StringEscapeUtils.unescapeJava(str), GlobalType.STRING));
        currentQueue.add(new Instruction(InstructionEnum.PUSH, global.size() - 1));
        currentQueue.add(new Instruction(InstructionEnum.PRINTS, null));
        return Type.VOID;
    }

    @Override
    public Type visitPutLn(C0Parser.PutLnContext ctx) {
        currentQueue.add(new Instruction(InstructionEnum.PRINTLN, null));
        return Type.VOID;
    }

    public Object deepClone(Object f) {
        //将对象写入流中
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(f);
            //从流中取出
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
            return null;
        }


    }
}
