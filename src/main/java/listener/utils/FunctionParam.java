package listener.utils;

public class FunctionParam {
    private boolean isConst;
    private String paramName;
    private Type paramType;

    public FunctionParam(boolean isConst, String paramName, Type paramType) {
        this.isConst = isConst;
        this.paramName = paramName;
        this.paramType = paramType;
    }

    public boolean isConst() {
        return isConst;
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

    public Type getParamType() {
        return paramType;
    }

    public void setParamType(Type paramType) {
        this.paramType = paramType;
    }

    @Override
    public String toString() {
        return "FunctionParam{" +
                "isConst=" + isConst +
                ", paramName='" + paramName + '\'' +
                ", paramType=" + paramType +
                '}';
    }
}