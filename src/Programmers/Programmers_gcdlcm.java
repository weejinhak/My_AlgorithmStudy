package Programmers;

import java.util.Arrays;

public class Programmers_gcdlcm {

    public static int[] gcdlcm(int a, int b) {

        int[] answer = new int[2];
        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];

        return answer;
    }

    public static int gcd(int a, int b) {
        System.out.println("a:"+a +" b:"+b);
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Programmers_gcdlcm t = new Programmers_gcdlcm();
        System.out.println(Arrays.toString(t.gcdlcm(3, 12)));

    }
}
