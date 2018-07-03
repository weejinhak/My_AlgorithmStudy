package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_2749 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long fibo = fibonacci(n);
        System.out.println(fibo % 1000000);

    }

    private static long fibonacci(int n) {
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
}
