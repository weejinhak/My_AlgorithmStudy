package Shin.Practice1;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(5));
        System.out.println(recursivefibo(5));
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

    private static long recursivefibo(int n) {
        if (n == 0 || n == 1) return n;
        return recursivefibo(n - 1) + recursivefibo(n - 2);
    }
}

