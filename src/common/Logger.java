package common;

public class Logger {
    public static void info(Object obj) {
        System.out.println(obj);
    }

    public static void info(Object obj, boolean b) {
        System.out.print(obj);
    }

    public static void warn(Object obj) {
        System.err.println(obj);
    }

    public static void warn(Object obj, boolean b) {
        System.err.print(obj);
    }
}
