package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        단, 대문자와 소문자를 구분하지 않는다.

        입력
        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

        출력
        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
        단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
*/


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
