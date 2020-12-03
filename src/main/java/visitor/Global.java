package visitor;

public class Global {
    private String name;
    private GlobalType type;

    public Global(String name, GlobalType type) {
        this.name = name;
        this.type = type;
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
                '}';
    }
}

enum GlobalType {
    FUNCTION, VAR, CONST, STRING
}
