package visitor.function;

import visitor.utils.Type;

/**
 * ��������ʵ����
 * ʵ�ֵĽӿ�ʵ����û������� ���Ժ���
 */
public class FunctionParam {
    private boolean isConst;
    private String paramName;
    private Type paramType;
    private int offset;

    public FunctionParam(boolean isConst, String paramName, Type paramType, int offset) {
        this.isConst = isConst;
        this.paramName = paramName;
        this.paramType = paramType;
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isConst() {
        return isConst;
    }

    public Type getType() {
        return paramType;
    }

    public void setType(Type type) {
        this.paramType = type;
    }

    public void setConst(boolean aConst) {
        isConst = aConst;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Override
    public String toString() {
        return "FunctionParam{" +
                "isConst=" + isConst +
                ", paramName='" + paramName + '\'' +
                ", paramType=" + paramType +
                ", offset=" + offset +
                '}';
    }
}
