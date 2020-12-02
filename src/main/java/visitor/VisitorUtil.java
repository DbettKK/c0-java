package visitor;

import listener.utils.Expression;
import listener.utils.Type;

public class VisitorUtil {

    public static Expression callFunc() {
        return null;
    }

    public static Expression intDoubleTransfer(Expression source, Type transferTo) {
        Type sourceType = source.getType();
        if (sourceType == Type.VOID) {
            throw new RuntimeException("as-from-void");
        }
        if (sourceType == transferTo) {
            return source;
        } else {
            if (transferTo == Type.INT) {
                return new Expression((int)(double) source.getValue(), transferTo);
            } else if (transferTo == Type.DOUBLE) {
                return new Expression((double)(int) source.getValue(), transferTo);
            }
        }
        return null;
    }

    public static Expression nagExpr(Expression e, int minusNum) {
        if (e.getType() == Type.VOID) {
            throw new RuntimeException("nag-void");
        }
        if (minusNum % 2 == 0) {
            return e;
        } else {
            Object value = 0;
            if (e.getType() == Type.DOUBLE) value = (double) e.getValue() * -1;
            else if (e.getType() == Type.INT) value = (int) e.getValue() * -1;
            return new Expression(value, e.getType());
        }
    }

    public static Expression exprSymbolExpr(Expression left, String symbol, Expression right) {
        switch (symbol) {
            case "+":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() + (int) right.getValue(), Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() + (double) right.getValue(), Type.DOUBLE);
                break;
            case "-":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() - (int) right.getValue(), Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() - (double) right.getValue(), Type.DOUBLE);
                break;
            case "*":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() * (int) right.getValue(), Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() * (double) right.getValue(), Type.DOUBLE);
                break;
            case "/":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() / (int) right.getValue(), Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() / (double) right.getValue(), Type.DOUBLE);
                break;
            case ">":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() > (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() > (double) right.getValue() ? 1 : 0, Type.INT);
                break;
            case "<":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() < (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() < (double) right.getValue() ? 1 : 0, Type.INT);
                break;
            case ">=":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() >= (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() >= (double) right.getValue() ? 1 : 0, Type.INT);
                break;
            case "<=":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() <= (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() <= (double) right.getValue() ? 1 : 0, Type.INT);
                break;
            case "==":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() == (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() == (double) right.getValue() ? 1 : 0, Type.INT);
                break;
            case "!=":
                if (left.getType() == Type.INT) {
                    return new Expression((int) left.getValue() != (int) right.getValue() ? 1 : 0, Type.INT);
                } else if (left.getType() == Type.DOUBLE)
                    return new Expression((double) left.getValue() != (double) right.getValue() ? 1 : 0, Type.INT);
                break;
        }
        return null;
    }

    public static boolean getCondition(Expression e) {
        boolean condition = false;
        if (e.getType() == Type.VOID) {
            throw new RuntimeException("expect-bool-but-void");
        }
        if (e.getType() == Type.DOUBLE) {
            double value = (double) e.getValue();
            condition = value != 0;
        }
        if (e.getType() == Type.INT) {
            int value = (int) e.getValue();
            condition = value != 0;
        }
        return condition;
    }
}
