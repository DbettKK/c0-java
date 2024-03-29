package trying;

import trying.antlr.scratchParser;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Function implements Serializable {
    private String funcName;
    private List<FunctionParam> paramList;
    private Map<String, FunctionParam> paramMap;
    private Type returnType;
    private int offset;

    private int localVarOffset = 0;


    private int locSlot = 0;

    private Object returnValue;

    /**
     * this is used truly
     * @param funcName 函数名
     * @param paramList 参数列表
     * @param returnType 返回值类型
     * @param offset 函数的偏移
     */
    public Function(String funcName, List<FunctionParam> paramList, Type returnType, int offset) {
        this.funcName = funcName;
        this.paramList = paramList;
        this.returnType = returnType;
        this.offset = offset;
    }

    public Function(String funcName, Map<String, FunctionParam> paramMap, Type returnType, int offset) {
        this.funcName = funcName;
        this.paramMap = paramMap;
        this.returnType = returnType;
        this.offset = offset;
    }

    public Function(String funcName, Map<String, FunctionParam> paramMap, Type returnType, int offset, Object returValue) {
        this.funcName = funcName;
        this.paramMap = paramMap;
        this.returnType = returnType;
        this.offset = offset;
        this.returnValue = returValue;
    }

    public List<FunctionParam> getParamList() {
        return paramList;
    }

    public void setParamList(List<FunctionParam> paramList) {
        this.paramList = paramList;
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

    public Object getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Object returValue) {
        this.returnValue = returValue;
    }

    public int getLocalVarOffset() {
        return localVarOffset;
    }

    public void setLocalVarOffset(int localVarOffset) {
        this.localVarOffset = localVarOffset;
    }

    public int getLocSlot() {
        return locSlot;
    }

    public void setLocSlot(int locSlot) {
        this.locSlot = locSlot;
    }

    @Override
    public String toString() {
        return "Function{" +
                "funcName='" + funcName + '\'' +
                ", paramList=" + paramList +
                ", returnType=" + returnType +
                ", offset=" + offset +
                '}';
    }

    public static void funcAssign(Type leftType, scratchParser.Func_exprContext ctx, Map<String, Function> funcTable) {
        if (ctx.call_func() != null) {
            // a = func();
            String funcName = ctx.call_func().IDENT().getText();
            if (funcTable.get(funcName).getReturnType() != leftType) {
                throw new RuntimeException("assign-type-conflict");
            }
        } else if (ctx.call_stdlib() != null) {
            // a = putInt() ...
            scratchParser.Call_stdlibContext stdlibFunc = ctx.call_stdlib();
            if (stdlibFunc.PUTINT() != null ) {
                // 放入int类型
            } else if (stdlibFunc.PUTDOUBLE() != null) {

            }
        }
    }
}
