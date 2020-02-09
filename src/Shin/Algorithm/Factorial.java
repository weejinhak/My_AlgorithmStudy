package Shin.Algorithm;

public class Factorial {
    public static void main(String[] args){
        int input = 4;

        System.out.println(fact(input));
    }

     private static int fact(int n){
        if(n<=1){
            return n;
        }
        else
        return fact(n-1)*n;
    }
}
