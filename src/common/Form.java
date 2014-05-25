package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Form {
    public static String input() {
        String str = null;

        try {
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            // Nothing to do
        }

        return str;
    }
}
