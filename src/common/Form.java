package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Form {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));;

    public static String input() {
        String str = null;

        try {
            str = reader.readLine();
        } catch (IOException e) {
            // Nothing to do
        }

        return str;
    }

    public static String input_require() {
        String str = null;

        try {
            while(str == null || str.length() == 0) {
                str = reader.readLine();
            }
        } catch (IOException e) {
            // Nothing to do
        }

        return str;
    }
}
