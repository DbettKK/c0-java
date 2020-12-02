package visitor;

import c0.C0BaseVisitor;
import c0.C0Parser;
import listener.utils.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;

public class YourVisitor extends C0BaseVisitor<Type> {
    Stack<Instruction> instructions = new Stack<>();
    SymbolTable table = new SymbolTable(null, "");

    SymbolTable currentTable;
    Map<String, Function> funcTable = new HashMap<>();
    
    List<String> global = new ArrayList<>();

    @Override
    public Type visitProgram(C0Parser.ProgramContext ctx) {
        currentTable = table;
        for (ParseTree child : ctx.children) {
            visit(child);
        }
        while (!instructions.isEmpty()) {
            System.out.println(instructions.pop());
        }
        return null;
    }

    @Override
    public Type visitFuncExpr(C0Parser.FuncExprContext ctx) {
        return null;
    }

    @Override
    public Type visitLetDeclStmt(C0Parser.LetDeclStmtContext ctx) {
        boolean isGlobal = currentTable.getPrevTable() == null;
        String ident = ctx.IDENT().getText();
        if (currentTable.getCurTable(ident) != null) {
            throw new RuntimeException("duplicated-let-declare");
        }
        if (ctx.ASSIGN() == null) {
            currentTable.put(ident, new SymbolEntry(false, false, isGlobal, !isGlobal,
                    currentTable.getOffset(), Utils.getType(ctx.ty.getText())));
        } else {
            Type let = visit(ctx.expr());
            if (let != Utils.getType(ctx.ty.getText()))
                throw new RuntimeException("let-declare-type-conflict");
            currentTable.put(ident, new SymbolEntry(false, false, isGlobal, !isGlobal,
                    currentTable.getOffset(), Utils.getType(ctx.ty.getText())));
        }
        if (isGlobal) global.add(ident);
        return null;
    }

    @Override
    public Type visitConstDeclStmt(C0Parser.ConstDeclStmtContext ctx) {
        boolean isGlobal = currentTable.getPrevTable() == null;
        String ident = ctx.IDENT().getText();
        if (currentTable.getCurTable(ident) != null) {
            throw new RuntimeException("duplicated-const-declare");
        }
        Type constVar = visit(ctx.expr());
        if (constVar != Utils.getType(ctx.ty.getText()))
            throw new RuntimeException("const-declare-type-conflict");
        currentTable.put(ident, new SymbolEntry(true, false, isGlobal, !isGlobal,
                currentTable.getOffset(), Utils.getType(ctx.ty.getText())));
        if (isGlobal) global.add(ident);
        return null;
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
            instructions.push(new Instruction(instruction, null));
        }
        return type;
    }

    @Override
    public Type visitAssignExpr(C0Parser.AssignExprContext ctx) {
        String ident = ctx.IDENT().getText();
        if (currentTable.getChainTable(ident) == null) {
            throw new RuntimeException("assign-to-undeclared-ident");
        }
        Type type = visit(ctx.expr());
        if (currentTable.getChainTable(ident).getType() != type) {
            throw new RuntimeException("assign-type-conflict");
        } else if (currentTable.getChainTable(ident).isConst()) {
            throw new RuntimeException("assign-to-const");
        }
        return null;
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
        System.out.println(left);
        String symbol = ctx.BOOL_OP().getText();
        Type right = visit(ctx.expr(1));
        if (right == Type.VOID || left != right) {
            throw new RuntimeException("cmp-type-conflict");
        }
        return exprSymbolExpr(left, symbol, right);
    }
    
    @Override
    public Type visitIdent(C0Parser.IdentContext ctx) {
        boolean isParam;
        FunctionParam param = null;
        String ident = ctx.IDENT().getText();
        SymbolEntry entry = currentTable.getChainTable(ident);
        if (entry == null) {
            throw new RuntimeException("use-undeclared-ident");
        }
        return entry.getType();
    }

    @Override
    public Type visitUint(C0Parser.UintContext ctx) {
        int value;
        try {
            value = Integer.parseInt(ctx.UINT().getText());
        } catch (Exception e) {
            value = ctx.UINT().getText().charAt(0);
        }
        instructions.push(new Instruction(InstructionEnum.PUSH, value));
        return Type.INT;
    }

    @Override
    public Type visitDouble(C0Parser.DoubleContext ctx) {
        String doubleText = ctx.DOUBLE().getText();
        double d = Double.parseDouble(doubleText);
        long l = Double.doubleToRawLongBits(d);
        instructions.push(new Instruction(InstructionEnum.PUSH, l));
        return Type.DOUBLE;
    }

    @Override
    public Type visitExprStmt(C0Parser.ExprStmtContext ctx) {
        visit(ctx.expr());
        return null;
    }

    public Type exprSymbolExpr(Type left, String symbol, Type right) {
        InstructionEnum instructionEnum;
        switch (symbol) {
            case "+":
                instructionEnum = left == Type.INT ? InstructionEnum.ADDI : InstructionEnum.ADDF;
                instructions.push(new Instruction(instructionEnum, null));
                return left;
            case "-":
                instructionEnum = left == Type.INT ? InstructionEnum.SUBI : InstructionEnum.SUBF;
                instructions.push(new Instruction(instructionEnum, null));
                return left;
            case "*":
                instructionEnum = left == Type.INT ? InstructionEnum.MULI : InstructionEnum.MULF;
                instructions.push(new Instruction(instructionEnum, null));
                return left;
            case "/":
                instructionEnum = left == Type.INT ? InstructionEnum.DIVI : InstructionEnum.DIVF;
                instructions.push(new Instruction(instructionEnum, null));
                return left;
            case ">":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                instructions.push(new Instruction(InstructionEnum.SETGT, null));
                return Type.VOID;
            case "<":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                instructions.push(new Instruction(InstructionEnum.SETLT, null));
                return Type.VOID;
            case ">=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                instructions.push(new Instruction(InstructionEnum.SETLT, null));
                instructions.push(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "<=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                instructions.push(new Instruction(InstructionEnum.SETGT, null));
                instructions.push(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "==":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                instructions.push(new Instruction(InstructionEnum.NOT, null));
                return Type.VOID;
            case "!=":
                instructionEnum = left == Type.INT ? InstructionEnum.CMPI : InstructionEnum.CMPF;
                instructions.push(new Instruction(instructionEnum, null));
                return Type.VOID;
        }
        return null;
    }

    public Type intDoubleTransfer(Type source, Type transferTo) {
        if (source == Type.VOID) {
            throw new RuntimeException("as-from-void");
        }
        if (source == transferTo) {
            return source;
        } else {
            if (transferTo == Type.INT) {
                instructions.push(new Instruction(InstructionEnum.FTOI, null));
                return transferTo;
            } else if (transferTo == Type.DOUBLE) {
                instructions.push(new Instruction(InstructionEnum.ITOF, null));
                return transferTo;
            }
        }
        return null;
    }
}
