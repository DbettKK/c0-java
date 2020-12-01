package listener.utils;

public class SymbolEntry implements ParamAndLocal {
    private boolean isConstant;
    private boolean isInitialized;
    private int stackOffset;

    private Type type;
    private Object value;

    /**
     * @param isConstant 是否为常量
     * @param isDeclared 是否初始化
     * @param stackOffset 偏移
     */
    public SymbolEntry(boolean isConstant, boolean isDeclared, int stackOffset) {
        this.isConstant = isConstant;
        this.isInitialized = isDeclared;
        this.stackOffset = stackOffset;
    }

    public SymbolEntry(boolean isConstant, boolean isInitialized, int stackOffset, Type type) {
        this.isConstant = isConstant;
        this.isInitialized = isInitialized;
        this.stackOffset = stackOffset;
        this.type = type;
    }

    public SymbolEntry(boolean isConstant, boolean isInitialized, int stackOffset, Type type, Object value) {
        this.isConstant = isConstant;
        this.isInitialized = isInitialized;
        this.stackOffset = stackOffset;
        this.type = type;
        this.value = value;
    }

    /**
     * @return the stackOffset
     */
    public int getStackOffset() {
        return stackOffset;
    }

    /**
     * @return the isConstant
     */
    @Override
    public boolean isConst() {
        return isConstant;
    }

    /**
     * @return the isInitialized
     */
    public boolean isInitialized() {
        return isInitialized;
    }

    /**
     * @param isConstant the isConstant to set
     */
    public void setConstant(boolean isConstant) {
        this.isConstant = isConstant;
    }

    /**
     * @param isInitialized the isInitialized to set
     */
    public void setInitialized(boolean isInitialized) {
        this.isInitialized = isInitialized;
    }

    /**
     * @param stackOffset the stackOffset to set
     */
    public void setStackOffset(int stackOffset) {
        this.stackOffset = stackOffset;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SymbolEntry{" +
                "isConstant=" + isConstant +
                ", isInitialized=" + isInitialized +
                ", stackOffset=" + stackOffset +
                ", type=" + type +
                ", value=" + value +
                '}';
    }
}
