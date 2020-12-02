package visitor;

import c0.C0Parser;

import java.util.HashMap;
import java.util.Map;

public class FunctionNode {
    private C0Parser.FunctionContext functionContext;
    private int offset = 0;

    public FunctionNode(C0Parser.FunctionContext functionContext, int offset) {
        this.functionContext = functionContext;
        this.offset = offset;
    }

    public C0Parser.FunctionContext getFunctionContext() {
        return functionContext;
    }

    public void setFunctionContext(C0Parser.FunctionContext functionContext) {
        this.functionContext = functionContext;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "FunctionNode{" +
                "functionContext=" + functionContext +
                ", offset=" + offset +
                '}';
    }
}
