package Shin.Practice1;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {

    }

    private static void
    primeCounter(ArrayList<Integer> arrayList) {
        int prime_counter = 0;
        int isPrime;

        for (int i = 0; i < arrayList.size(); i++) {
            isPrime = 0;
            int prime = arrayList.get(i);
            for (int j = 0; j <= prime; j++) {
                if (prime % 2 == 0) isPrime++;
            }
            if (isPrime == 2) prime_counter++;
        }
        System.out.println("소수의 개수" + prime_counter + "개");
    }

    private static void getPrime(int max) {
        boolean[] primeArr = new boolean[max + 1];
        for (int i = 0; i < max; i++) {
            primeArr[i] = true;
        }
        for (int i = 2; i < max; i++) {
            for (int j = i + i; j < max; j += i) {
                primeArr[j] = false;
            }
        }
        for(int i = 2; i<max; i++){
            if(primeArr[i]) System.out.println(i);
        }

    }

}
