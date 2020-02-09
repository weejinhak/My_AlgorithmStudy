package Shin.Practice;

public class Factorial {
    public static void main(String[] args) {
        int input = 4;
    }


    private static int fac(int n) {
        if (n == 1) return n;
        else return fac(n - 1) * n;
    }
}
