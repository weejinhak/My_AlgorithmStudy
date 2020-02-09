package Hanwha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test01 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str01 = "";
        String str02 = "";

        if (st.hasMoreTokens()) {
            str01 = st.nextToken();
            str02 = st.nextToken();
        }

        char[] strArr01 = str01.toCharArray();
        char[] strArr02 = str02.toCharArray();

        ArrayList<String> stringArrayList01 = new ArrayList<>();
        ArrayList<String> stringArrayList02 = new ArrayList<>();

        for (int i = 0; i < str01.length(); i++) {
            stringArrayList01.add(String.valueOf(strArr01[i]));
            stringArrayList02.add(String.valueOf(strArr02[i]));
        }

        Collections.sort(stringArrayList01);
        Collections.sort(stringArrayList02);

        for (int i = 0; i < stringArrayList01.size(); i++) {
            if (!stringArrayList01.get(i).equals(stringArrayList02.get(i))) {
                System.out.println("다른 문자쌍");
                return;
            }
        }
        System.out.println("같은 문자쌍");
    }

}
