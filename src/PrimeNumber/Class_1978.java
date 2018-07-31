package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class_1978 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < inputNum; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        int primeCount = 0;
        int isPrimeCount;

        for (int i = 0; i < arrayList.size(); i++) {
            int prime = arrayList.get(i);
            isPrimeCount = 0;
            for (int j = 1; j <= prime; j++) {
                if (prime % j == 0) {
                    isPrimeCount++;
                }
            }
            if (isPrimeCount == 2) {
                primeCount++;
            }
        }

        System.out.println(primeCount);

    }
}
