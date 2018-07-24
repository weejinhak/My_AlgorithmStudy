package Searching_Rule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_1193 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int x = 0;
        int y = 0;
        int num = 0;
        int tempCount = 0;

        for (int i = 1; ; i++) {
            if (input - (tempCount + i) <= 0) {
                num = input - tempCount;
                if (i % 2 == 0) {
                    x = num;
                    y = (i + 1) - num;
                } else {
                    x = (i + 1) - num;
                    y = num;
                }
                break;
            }
            tempCount += i;
        }
    }
}
