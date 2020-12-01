package listener.utils;

import antlr.scratchParser;
import listener.MyParserListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Utils {
    public static List<String> instruction = new ArrayList<>();
    public static Queue<TerminalNode> queue = new ArrayDeque<>();
    public static Map<String, List<Expression>> funcParamExprMap = new HashMap<>();
    public static Type getType(String s) {
        if (s.equals("int")) {
            return Type.INT;
        } else if (s.equals("double")) {
            return Type.DOUBLE;
        }
        return Type.VOID;

    }

    public static void FuncParamAnalyse(ParseTree func) {
        String funcName = func.getChild(0).getText();
        //System.out.println(funcName);
        Map<String, Function> funcTable = MyParserListener.getFuncTable();
        Map<String, FunctionParam> paramMap = funcTable.get(funcName).getParamMap();
        ParseTree param = func.getChild(2);
        int paramNum = paramMap.size();
        int actualNum;
        if (param.getText().equals(")")) actualNum = 0;
        else {
            actualNum = (param.getChildCount() + 1 ) / 2;
        }
        if (paramNum != actualNum) {
            throw new RuntimeException("func-param-num-error");
        }
        int paramIndex, actualIndex;
        Type paramType, actualType;
        for (String s : paramMap.keySet()) {
            FunctionParam functionParam = paramMap.get(s);
            paramIndex = functionParam.getOffset();
            paramType = functionParam.getType();
            actualIndex = paramIndex * 2;
            ParseTree expr = param.getChild(actualIndex);
            Queue<TerminalNode> paramQueue = new ArrayDeque<>();
            PostOrder(expr, paramQueue);
            actualType = handleExprStack(paramQueue);
            if (actualType != paramType) {
                throw new RuntimeException("illegal-func-call-param-type-error");
            }
        }
    }

    public static void PostOrder(ParseTree tree, Queue<TerminalNode> queue){
        if(tree != null) {
            int childNum = tree.getChildCount();
            int index = 0;
            if (childNum >= 3 && tree.getChild(0) instanceof TerminalNode
                    && tree.getChild(1).getText().equals("(")) {
                queue.add((TerminalNode) tree.getChild(0));
                FuncParamAnalyse(tree);
                //System.out.println(tree.getChild(0).getText());
                return;
            }
            PostOrder(tree.getChild(index), queue);
            while (index + 1 < childNum) {
                index += 2;
                PostOrder(tree.getChild(index), queue);
                index--;
                PostOrder(tree.getChild(index), queue);
                index++;
            }
            if (tree instanceof TerminalNode) {
                queue.add((TerminalNode) tree);
                //System.out.println(tree.getText());
            }
            /*if (tree.getChildCount() >= 2) {
                PostOrder(tree.getChild(2));
            }
            if (tree.getChildCount() == 3) {
                PostOrder(tree.getChild(tree.getChildCount() - 2));
            }
            if (tree instanceof TerminalNode) {
                queue.add((TerminalNode) tree);
            }*/
        }
    }

    public static Type handleExprStack(Queue<TerminalNode> queue) {
        //System.out.println(stack);
        // 栈内只会为奇数
        /*TerminalNode pop = stack.pop();
        while (pop.getText().equals("(")) {
            TerminalNode pop1 = stack.pop();
            handleInstruction(pop1);
            TerminalNode pop2 = stack.pop();
            if (!pop2.getText().equals(")")) {
                throw new RuntimeException("invalid-stack");
            }
        }
        handleInstruction(pop);*/
        //System.out.println(queue);
        cleanParenInQueue(queue);
        Stack<Type> stack = new Stack<>();
        while (!queue.isEmpty()) {
            TerminalNode poll = queue.poll();
            if (!checkSymbolOrNot(poll)) {
                stack.push(handleInstruction(poll).getType());
            } else {
                Type type1 = stack.pop();
                Type type2 = stack.pop();
                type1 = handleTriplex(type1, poll, type2);
                stack.push(type1);
            }
        }
        Type finalType = stack.pop();
        return finalType;
        /*TerminalNode pop1 = queue.poll();
        Type type1 = handleInstruction(pop1).getType();
        while (!queue.isEmpty()) {
            TerminalNode pop2 = queue.poll();
            TerminalNode pop3 = queue.poll();
            Type type3 = handleInstruction(pop2).getType();
            type1 = handleTriplex(type1, pop3, type3);
        }
        return type1;*/
    }

    public static Expression handleInstruction(TerminalNode terminalNode) throws RuntimeException {
        String content = terminalNode.getText();
        int type = terminalNode.getSymbol().getType();
        if (type <= 36 && type >= 29) {
            // stdlib
            //GETINT=29, GETDOUBLE=30,
            //		GETCHAR=31, PUTINT=32, PUTDOUBLE=33, PUTCHAR=34, PUTSTR=35, PUTLN=36,
            //System.out.println("std");
            switch (type) {
                case 29:
                    return new Expression(0, Type.INT);
                case 30:
                    return new Expression(0, Type.DOUBLE);
                case 31:
                    return new Expression(0, Type.INT);
                case 32:
                    return new Expression(0, Type.VOID);
                case 33:
                    return new Expression(0, Type.VOID);
                case 34:
                    return new Expression(0, Type.VOID);
                case 35:
                    return new Expression(0, Type.VOID);
                case 36:
                    return new Expression(0, Type.VOID);
            }
            return null;
        } else if (type == 37) {
            // UINT or CHAR
            int value;
            try {
                value = Integer.parseInt(content);

            } catch (Exception e) {
                value = content.charAt(1);
            }
            instruction.add("Push " + value);
            return new Expression(value, Type.INT);
            //instruction.add("PUSH " + value);
        } else if (type == 39) {
            // DOUBLE
            double d = Double.parseDouble(content);
            long l = Double.doubleToRawLongBits(d);
            instruction.add("Push " + l);
            return new Expression(l, Type.DOUBLE);
            //instruction.add("PUSH " + l);
        } else if (type == 40) {
            // IDENT OR FUNCTION-NAME
            Map<String, Function> funcTable = MyParserListener.getFuncTable();
            SymbolTable currentTable = MyParserListener.getCurrentSymbolTable();
            Function currentFunction = MyParserListener.getCurrentFunction();
            if (funcTable.get(content) != null) {
                // func
                Function function = funcTable.get(content);
                boolean isVoid = function.getReturnType() == Type.VOID;
                instruction.add("StackAlloc" + (isVoid ? 0 : 1));
                instruction.add("Call" + (function.getOffset() + 1));
                return new Expression(0, function.getReturnType());
            } else {
                // ident
                // 判断是全局变量还是局部变量还是函数参数
                if (currentTable.getCurTable(content) != null) {
                    // 局部变量
                    instruction.add("LocA" + currentTable.getCurTable(content).getStackOffset());
                    instruction.add("Load64");
                    return new Expression(0, currentTable.getCurTable(content).getType());
                } else if (currentFunction.getParamMap().get(content) != null) {
                    // 函数参数
                    instruction.add("ArgA" + currentFunction.getParamMap().get(content).getOffset());
                    instruction.add("Load64");
                    return new Expression(0, currentFunction.getParamMap().get(content).getType());
                } else if (currentTable.getChainTable(content) != null) {
                    // 全局变量
                    instruction.add("GlobA" + currentTable.getChainTable(content).getStackOffset());
                    instruction.add("Load64");
                    return new Expression(0, currentTable.getChainTable(content).getType());
                } else {
                    throw new RuntimeException("undecalred-ident");
                }

            }

        } else if (content.equals("int") || content.equals("double") ) {
            // do nothing
            return new Expression(0, content.equals("int") ? Type.INT : Type.DOUBLE);
        } else {
            throw new RuntimeException("illegal-token");
        }

    }

    public static Type handleTriplex(Type type1, TerminalNode symbolNode, Type type3) {
        String symbol = symbolNode.getText();
        switch (symbol) {
            case "+":
                checkTypeEquals(type1, type3);
                if (type1 == Type.DOUBLE) {
                    instruction.add("AddF");
                    return Type.DOUBLE;
                } else {
                    instruction.add("AddI");
                    return Type.INT;
                }
            case "-":
                checkTypeEquals(type1, type3);
                if (type1 == Type.DOUBLE) {
                    instruction.add("SubF");
                    return Type.DOUBLE;
                } else {
                    instruction.add("SubI");
                    return Type.INT;
                }
            case "*":
                checkTypeEquals(type1, type3);
                if (type1 == Type.DOUBLE) {
                    instruction.add("MulF");
                    return Type.DOUBLE;
                } else {
                    instruction.add("MulI");
                    return Type.INT;
                }
            case "/":
                checkTypeEquals(type1, type3);
                if (type1 == Type.DOUBLE) {
                    instruction.add("DivF");
                    return Type.DOUBLE;
                } else {
                    instruction.add("DivI");
                    return Type.INT;
                }
            case "as":
                if (type1 == Type.VOID || type3 == Type.VOID) throw new RuntimeException("as-void-error");
                else if (type1 == Type.DOUBLE && type3 == Type.INT) {
                    instruction.add("FToI");
                    return Type.INT;
                } else if (type1 == Type.INT && type3 == Type.DOUBLE) {
                    instruction.add("IToF");
                    return Type.DOUBLE;
                }
                break;
            case ">":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                instruction.add("SetGt");
                return Type.VOID;
            case "<":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                instruction.add("SetLt");
                return Type.VOID;
            case ">=":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                instruction.add("SetLt");
                instruction.add("Not");
                return Type.VOID;
            case "<=":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                instruction.add("SetGt");
                instruction.add("Not");
                return Type.VOID;
            case "==":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                instruction.add("Not");
                return Type.VOID;
            case "!=":
                checkTypeEquals(type1, type3);
                if (type1 == Type.INT) instruction.add("CmpI");
                if (type1 == Type.DOUBLE) instruction.add("CmpF");
                return Type.VOID;
            default:
                return null;
        }
        return null;
    }

    public static void cleanParenInQueue(Queue<TerminalNode> queue) {
        Queue<TerminalNode> tmp = new ArrayDeque<>();
        while (!queue.isEmpty()) {
            TerminalNode poll = queue.poll();
            if (poll.getText().equals("(") || poll.getText().equals(")")) continue;
            tmp.add(poll);
        }
        while (!tmp.isEmpty()) queue.add(tmp.poll());
    }

    public static void checkTypeEquals(Type type1, Type type3) {
        if (type1 != type3) throw new RuntimeException("unmatched-type");
    }

    public static boolean checkSymbolOrNot(TerminalNode node) {
        String[] symbols = {"+", "-", "*", "/", "as", ">=", "<=", "==", "!=", "<", ">"};
        for (String symbol : symbols) {
            if (node.getText().equals(symbol)) return true;
        }
        return false;
    }
}
