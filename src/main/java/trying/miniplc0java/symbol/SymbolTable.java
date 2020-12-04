package trying.miniplc0java.symbol;

import trying.miniplc0java.analyser.SymbolEntry;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, SymbolEntry> table;
    // 父表
    protected SymbolTable prevTable;
    private int offset = 0;

    public int getOffset() {
        return offset;
    }

    public SymbolTable(SymbolTable p) {
        table = new HashMap<String, SymbolEntry>();
        prevTable = p;
    }

    public void put(String s, SymbolEntry id) {
        offset++;
        table.put(s, id);
    }

    public SymbolEntry get(String s) {
        for (SymbolTable e = this; e != null; e = e.prevTable) {
            SymbolEntry found = e.table.get(s);
            if (found != null) return found;
        }
        return null;
    }

    /**
     * 验证该变量是否在符号表存在
     * @param s 变量名
     * @return 存在为true 不存在为false
     */
    public boolean check(String s) {
        if (get(s) != null) return true;
        return false;
    }

    @Override
    public String toString() {
        return "SymbolTable{" +
                "table=" + table +
                ", prevTable=" + prevTable +
                '}';
    }
}
