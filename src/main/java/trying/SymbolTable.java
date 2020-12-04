package trying;


import java.util.HashMap;
import java.util.Map;

/**
 * 符号表！
 */
public class SymbolTable {
    private Map<String, SymbolEntry> table;
    // 父表
    protected SymbolTable prevTable;
    private int offset = 0;
    private String funcName;

    public SymbolTable getPrevTable() {
        return prevTable;
    }

    public int getOffset() {
        return offset;
    }

    public SymbolTable(SymbolTable p, String funcName) {
        table = new HashMap<>();
        prevTable = p;
        this.funcName = funcName;
    }

    public SymbolTable(SymbolTable p) {
        table = new HashMap<>();
        prevTable = p;
    }

    public void put(String s, SymbolEntry id) {
        offset++;
        table.put(s, id);
    }

    public SymbolEntry getCurTable(String s) {
        return table.get(s);
    }

    public SymbolEntry getChainTable(String s) {
        for (SymbolTable e = this; e != null; e = e.prevTable) {
            SymbolEntry found = e.table.get(s);
            if (found != null) return found;
        }
        return null;
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "table=" + table +
                ", prevTable=" + prevTable +
                '}';
    }
}
