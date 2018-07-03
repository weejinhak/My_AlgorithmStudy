package Programmers;

import java.util.Scanner;

public class Programmers_Fibonacci {

    public long fibonacci(int num){

        long a = 1, b = 1, answer = 0;

        if(num==0||num==1) return num;

        for(int i = 1 ; i< num ; i++){
            answer = a + b;
            a = b;
            b = answer;

            System.out.println(answer);
        }

        return answer;
    }

    public static void main(String[] srgs){

        Programmers_Fibonacci c = new Programmers_Fibonacci();
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        System.out.println(c.fibonacci(s));
    }
}
