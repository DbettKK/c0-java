package trying;

public class SymbolEntry implements ParamAndLocal {
    private boolean isConstant;
    private boolean isParam;
    private boolean isGlobal;
    private boolean isLocal;
    private int localVarOffset = -1;
    private int stackOffset;
    private Type type;

    /* 无用属性 */
    private Object value;
    /* 无用属性 */
    private boolean isInitialized;

    /* 用这个 */
    public SymbolEntry(boolean isConstant, boolean isParam, boolean isGlobal, boolean isLocal, int stackOffset, Type type) {
        this.isConstant = isConstant;
        this.isParam = isParam;
        this.isGlobal = isGlobal;
        this.isLocal = isLocal;
        this.stackOffset = stackOffset;
        this.type = type;
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

    public boolean isParam() {
        return isParam;
    }

    public void setParam(boolean param) {
        isParam = param;
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    public void setGlobal(boolean global) {
        isGlobal = global;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
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

    public int getLocalVarOffset() {
        return localVarOffset;
    }

    public void setLocalVarOffset(int localVarOffset) {
        this.localVarOffset = localVarOffset;
    }

    @Override
    public String toString() {
        return "SymbolEntry{" +
                "isConstant=" + isConstant +
                ", isParam=" + isParam +
                ", isGlobal=" + isGlobal +
                ", isLocal=" + isLocal +
                ", localVarOffset=" + localVarOffset +
                ", stackOffset=" + stackOffset +
                ", type=" + type +
                '}';
    }
}
