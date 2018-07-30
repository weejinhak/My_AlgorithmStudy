package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10000];

        for (int i = 0; i < N; i++) {
            int index = Integer.parseInt(br.readLine());
            count[index] += 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < count[i]; j++) {
                System.out.println(i);
            }
        }
    }

}
