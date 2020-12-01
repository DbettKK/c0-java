package listener.utils;

public class FunctionParam implements ParamAndLocal{
    private boolean isConst;
    private String paramName;
    private Type paramType;

    public FunctionParam(boolean isConst, String paramName, Type paramType) {
        this.isConst = isConst;
        this.paramName = paramName;
        this.paramType = paramType;
    }
    @Override
    public boolean isConst() {
        return isConst;
    }

    @Override
    public Type getType() {
        return paramType;
    }

    @Override
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
                '}';
    }
}
