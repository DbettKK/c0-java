package visitor.table;

import trying.ParamAndLocal;
import visitor.utils.Type;

public class SymbolEntry {
    private boolean isConstant;
    private boolean isParam;
    private boolean isGlobal;
    private boolean isLocal;
    private int localVarOffset = -1;
    private int stackOffset;
    private Type type;

    public SymbolEntry(boolean isConstant, boolean isParam, boolean isGlobal, boolean isLocal, int stackOffset, Type type) {
        this.isConstant = isConstant;
        this.isParam = isParam;
        this.isGlobal = isGlobal;
        this.isLocal = isLocal;
        this.stackOffset = stackOffset;
        this.type = type;
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

    public int getStackOffset() {
        return stackOffset;
    }

    public boolean isConst() {
        return isConstant;
    }

    public void setConstant(boolean isConstant) {
        this.isConstant = isConstant;
    }

    public void setStackOffset(int stackOffset) {
        this.stackOffset = stackOffset;
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
