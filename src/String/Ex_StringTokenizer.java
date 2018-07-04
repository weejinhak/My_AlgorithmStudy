package String;

import java.util.StringTokenizer;

public class Ex_StringTokenizer {

    public static void main(String[] args) {
        String str = " this is my string ";

        StringTokenizer st = new StringTokenizer(str);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
