package Shin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long fibonacci = fibo(n);
        long recur = recusiveFibo(n);

        System.out.println(fibonacci);
        System.out.println(recur);
    }

    private static long fibo(int n) {
        long a = 1;
        long b = 1;
        long answer = 0;
        if (n == 0 || n == 1) return n;

        for (int i = 2; i < n; i++) {
            answer = a + b;
            a = b;
            b = answer;

        }
        return answer;
    }

    private static long recusiveFibo(int n) {
        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        } else {
            return recusiveFibo(n - 1) + recusiveFibo(n - 2);
        }
    }
}
