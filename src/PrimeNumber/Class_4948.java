package PrimeNumber;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Class_4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int input = Integer.parseInt(st.nextToken());
        List<Integer> inputList = new ArrayList<>();
        inputList.add(input);

        while (input != 0) {
            st = new StringTokenizer(br.readLine());
            input = Integer.parseInt(st.nextToken());
            inputList.add(input);
        }

        for (int i = 0; i < inputList.size() - 1; i++) {

            int min = inputList.get(i);
            int max = 2 * inputList.get(i);

            int[] primeNumArr = new int[max + 1];

            for (int j = 0; j <= max; j++) {
                primeNumArr[j] = 1;
            }
            primeNumArr[1] = 0;

            for (int j = 2; j <= max; j++) {
                for (int k = j + j; k <= max; k += j) {
                    primeNumArr[k] = 0;
                }
            }

            int count = 0;
            for (int j = min+1; j <= max; j++) {
                if (primeNumArr[j] == 1) count++;
            }
            System.out.println(count);
        }
    }

}