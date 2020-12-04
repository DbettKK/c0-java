package visitor.function;

import visitor.instruction.InstructionQueue;
import visitor.utils.Type;

import java.io.Serializable;
import java.util.List;

public class Function implements Serializable {
    private String funcName;
    private List<FunctionParam> paramList;
    private Type returnType;
    private int offset;
    private int localVarOffset = 0;
    private final InstructionQueue instructions = new InstructionQueue();
    private int locSlot = 0;


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

    public InstructionQueue getInstructions() {
        return instructions;
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
                ", instructions=" + instructions +
                '}';
    }

}
