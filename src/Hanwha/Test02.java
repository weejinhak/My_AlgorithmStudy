package Hanwha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test02 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        char[] chArr01;
        char[] chArr02;

        String str01 = "";
        String str02 = "";

        if (stringTokenizer.hasMoreTokens()) {
            str01 = stringTokenizer.nextToken();
            str02 = stringTokenizer.nextToken();
        }
        chArr01 = str01.toCharArray();
        chArr02 = str02.toCharArray();

        for (int i = 0; i < chArr01.length; i++) {
            for (int j = 0; j < chArr02.length; j++) {
                if (chArr01[i] == chArr02[j]) {
                    chArr01[i] = '0';
                }
            }
        }
        int count = 0;
        for (char c : chArr01) {
            if (c != '0') {
                System.out.println("다른문자열");
            } else {
                count++;
            }
        }
        if(count == chArr01.length){
            System.out.println("같은문자열");
        }

    }


}

