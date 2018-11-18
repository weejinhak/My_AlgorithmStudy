package Shin;

import java.util.ArrayList;

public class PrimeNumber {
    public static void main(String[] args) {

        PrimeMethod primeMethod = new PrimeMethod();
        primeMethod.getPrimeNumber(100);

    }
}

class PrimeMethod {

    //Prime Count in ArrayList
    void PrimeCounter(ArrayList<Integer> arrayList) {

        int primeCount = 0;
        int isPrimecount;

        for (int i = 0; i < arrayList.size(); i++) {
            int prime = arrayList.get(i);
            isPrimecount = 0;
            for (int j = 1; i <= prime; j++) {
                if (prime % j == 0) {
                    isPrimecount++;
                }
            }
            //카운트 하지 않고 찾기도 가능
            if (isPrimecount == 2) {
                primeCount++;
            }
        }
        System.out.println("소수의 개수" + primeCount);
    }

    //범위 내에서 소수 찾기 (에라토스테네스의 체)
    void getPrimeNumber(int max) {
        boolean[] primeNumArr = new boolean[max + 1];
        for (int i = 0; i < max; i++) {
            primeNumArr[i] = true;
        }

        for (int i = 2; i <= max; i++) {
            for (int j = i + i; j <= max; j += i) {
                primeNumArr[j] = false;
            }
        }
        //i를 2가 아닌 원하는 min 값으로 바꾸면 min~max 사이에서 소수 찾기
        for (int i = 2; i <= max; i++) {
            if (primeNumArr[i]) {
                System.out.println(i);
            }
        }
    }
}
