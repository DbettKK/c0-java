package listener.utils;

public class Expression {
    private Object value;
    private Type type;

    public Expression(Object value, Type type) {
        this.value = value;
        this.type = type;
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
        return "Expression{" +
                "value=" + value +
                ", type=" + type +
                '}';
    }

}
