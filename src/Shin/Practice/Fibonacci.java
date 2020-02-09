package Shin.Practice;

import java.io.IOException;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        System.out.println(fibo(10));
        System.out.println(recursiveFibo(10));
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

    private static long recursiveFibo(int n) {
        if (n == 0 || n == 1) return n;
        else return recursiveFibo(n - 1) + recursiveFibo(n - 2);
    }

}
