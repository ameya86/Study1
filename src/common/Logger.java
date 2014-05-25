package common;

public class Logger {
    public static void info(Object obj) {
        System.out.println(obj);
    }

    public static void warn(Object obj) {
        System.err.println(obj);
    }
}
