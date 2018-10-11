package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class_2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inversInt = new int[2];

        String str = "";

        String reStr = "";


        for (int i = 0; i < 2; i++) {
            str = st.nextToken();
            for (int j = 2; j >= 0; j--) {
                reStr += str.charAt(j);
            }
            inversInt[i] = Integer.parseInt(reStr);
            reStr = "";
        }

        if (inversInt[0] > inversInt[1]) {
            System.out.println(inversInt[0]);
        } else if (inversInt[0] < inversInt[1]) {
            System.out.println(inversInt[1]);
        }
    }
}
