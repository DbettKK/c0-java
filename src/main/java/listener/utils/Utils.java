package listener.utils;

public class Utils {
    public static Type getType(String s) {
        if (s.equals("int")) {
            return Type.INT;
        } else if (s.equals("double")) {
            return Type.DOUBLE;
        }
        return Type.VOID;

    }
}
