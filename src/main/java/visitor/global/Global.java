package visitor.global;

/**
 * 记录全局变量的实体类
 */
public class Global {
    private String name;
    private GlobalType type;
    private int offset;

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

    @Override
    public String toString() {
        return "Global{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", offset=" + offset +
                '}';
    }
}


