package PrimeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Class_9020 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            arrayList.add(Integer.parseInt(br.readLine()));
        }


        for (int i = 0; i < arrayList.size(); i++) {
            int max = arrayList.get(i);

            int[] primeNumArr = new int[max + 1];

            for (int j = 0; j <= max; j++) {
                primeNumArr[j] = 1;
            }
            for (int j = 2; j <= max; j++) {
                for (int k = j + j; k <= max; k += j) {
                    primeNumArr[k] = 0;
                }
            }

            int prime = arrayList.get(i);
            for (int j = 2; j <= prime / 2; j++) {
                if (primeNumArr[j] == 1 && primeNumArr[prime - j] == 1) {
                    //System.out.println(j + " " + (prime - j));
                    if (j <= prime - j)
                        System.out.println(j + " " + (prime - j));
                    else
                        System.out.println((prime - j) + " " + j);
                }
            }

        }

    }

}
