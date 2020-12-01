package listener.utils;

public interface ParamAndLocal {
    public default boolean isConst() {
        return false;
    }
    public default Type getType() {
        return null;
    }

    public default void setType(Type type) { }
}
