package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class_2581 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int minNum = Integer.parseInt(br.readLine());
        int maxNum = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        int isPrime;

        for (int i = minNum; i <= maxNum; i++) {
            int prime = i;
            isPrime = 0;
            for (int j = 1; j <= maxNum; j++) {
                if (prime % j == 0) isPrime++;
            }
            if (isPrime == 2) arrayList.add(prime);
        }

        int sumPrime = 0;
        for (int i : arrayList) {
            sumPrime += i;
        }

        if(arrayList.size()==0){
            System.out.println(-1);
            return;
        }

        System.out.println(sumPrime);
        System.out.println(arrayList.get(0));
    }

}
