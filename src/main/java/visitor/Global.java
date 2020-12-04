package visitor;

import java.util.ArrayList;
import java.util.List;

public class Global {
//    public static List<Global> funcGlobal = new ArrayList<>();
//    public static List<Global> varGlobal = new ArrayList<>();
//    public static List<Global> constGlobal = new ArrayList<>();
//    public static List<Global> strGlobal = new ArrayList<>();
    private String name;
    private GlobalType type;
    private String value;
    private int offset;

//    public void add(Global global) {
//        switch (global.getType()) {
//            case FUNCTION:
//                funcGlobal.add(global); break;
//            case VAR:
//                varGlobal.add(global); break;
//            case CONST:
//                constGlobal.add(global); break;
//            case STRING:
//                strGlobal.add(global); break;
//        }
//    }
//
//    public int size() {
//        return funcGlobal.size() + varGlobal.size() + constGlobal.size() + strGlobal.size();
//    }
//
//    public int strSize() {
//        return varGlobal.size() + constGlobal.size() + strGlobal.size();
//    }
//
//    public Global() {
//    }

    public Global(String name, GlobalType type) {
        this.name = name;
        this.type = type;
    }

    public Global(String name, GlobalType type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public Global(String name, GlobalType type, int offset) {
        this.name = name;
        this.type = type;
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlobalType getType() {
        return type;
    }

    public void setType(GlobalType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Global{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", offset=" + offset +
                '}';
    }
}


