package listener.utils;

public interface ParamAndLocal {
    abstract boolean isConst();
    abstract Type getType();
    abstract void setType(Type type);
}
