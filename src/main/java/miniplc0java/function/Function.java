package miniplc0java.function;

import antlr.scratchParser;
import miniplc0java.util.Type;

import java.util.Map;

public class Function {
    private String funcName;
    private Map<String, FunctionParam> paramMap;
    private Type returnType;
    private int offset;

    public Function(String funcName, Map<String, FunctionParam> paramMap, Type returnType, int offset) {
        this.funcName = funcName;
        this.paramMap = paramMap;
        this.returnType = returnType;
        this.offset = offset;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Map<String, FunctionParam> getParamMap() {
        return paramMap;
    }

    public void setParamMap(Map<String, FunctionParam> paramMap) {
        this.paramMap = paramMap;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Function{" +
                "funcName='" + funcName + '\'' +
                ", paramMap=" + paramMap +
                ", returnType=" + returnType +
                ", offset=" + offset +
                '}';
    }

}
