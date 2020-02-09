package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_BigNumber {
    public static void main(String[] args) {

        int[] numbers = {6, 10, 2};

        System.out.println(bigNumber(numbers));


    }

    private static String bigNumber(int[] numbers) {

        String answer = "";

        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = (String.valueOf(numbers[i]));
        }

        Arrays.sort(arr, (o1, o2) -> (o1 + o2).compareTo(o1 + o2));

        if (arr[0].equals("0")) return "0";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
