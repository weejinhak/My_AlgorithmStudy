package Shin.Practice;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

    }
}

class PrimeMethod {

    void PrimeCounter(ArrayList<Integer> arrayList) {

        int primeCounter = 0;
        int isPrime;

        for (int i = 0; i < arrayList.size(); i++) {
            int prime = arrayList.get(i);
            isPrime = 0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    isPrime++;
                }
            }
            if (isPrime == 2) {
                primeCounter++;
            }
        }
        System.out.println("소수의 개수는?" + primeCounter);
    }

    void getPrimeNumber(int max) {
        boolean[] primeArr = new boolean[max + 1];

        for (int i = 0; i < max; i++) {
            primeArr[i] = true;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = i + i; j < max; j += i) {
                primeArr[j] = false;
            }
        }

        for (int i = 2; i <= max; i++) {
            if (primeArr[i]) System.out.println(i);
        }

    }
}