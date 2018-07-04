package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String upperString = br.readLine().toUpperCase();

        int[] countAlphabet = new int[26];

        char[] strArr = upperString.toCharArray();

        //각각 알파벳이 있을 때마다 배열에 개수 증가
        for (int i = 0; i < strArr.length; i++) {
            int count = strArr[i] - 65;
            countAlphabet[count] += 1;
        }
        //알파벳배열에서 가장 개수가 많은 수
        int max = 0;
        for (int i = 0; i < countAlphabet.length; i++) {
            if (max < countAlphabet[i]) {
                max = countAlphabet[i];
            }
        }
        //개수가 많은 알파벳이 겹치는지 체크

        int result = 0;
        char ch = 0;
        for (int i = 0; i < countAlphabet.length; i++) {
            if (max == countAlphabet[i]) {
                result++;
                ch = (char) (i + 65);
            }
        }

        //출력
        if (result != 1) {
            System.out.println("?");
        } else {
            System.out.println(ch);
        }

    }

}
