package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Class_1929 {

    private static void primeNumber(int min, int max) {

        int[] primeNumArr = new int[max+1];

        for (int i = 0; i < max; i++) {
            primeNumArr[i] = 1;
        }
        primeNumArr[1] = 0;

        for (int i = 2; i <= max; i++) {
            for (int j = i + i; j <= max; j += i) {
                primeNumArr[j] = 0;
            }
        }

        for (int i = min; i <= max; i++) {
            if (primeNumArr[i] == 1) System.out.println(i);
        }

    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int minNum = Integer.parseInt(st.nextToken());
        int maxNum = Integer.parseInt(st.nextToken());

        primeNumber(minNum, maxNum);
    }


}
