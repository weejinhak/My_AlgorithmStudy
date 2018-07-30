package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Class_2108 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>();

        HashMap<Integer, Integer> frequency = new HashMap<>();

        float avg = 0;

        for (int i = 0; i < inputNum; i++) {
            int num = Integer.parseInt(br.readLine());
            intArr.add(num);

            avg += num;

        }

        //정렬
        Collections.sort(intArr);
        //산술평균
        System.out.println(Math.round(avg / inputNum));

        //중앙값
        if (intArr.size() == 1) {
            System.out.println(intArr.get(0));
        } else {
            System.out.println(intArr.get(inputNum / 2));
        }

        for (int i : intArr) {
            frequency.put(i, 0);
        }
        for (int i : intArr) {
            frequency.put(i, frequency.get(i) + 1);
        }

        //최빈값
        int max = Collections.max(frequency.values());
        int count = 0;
        int maxkey = 0;
        ArrayList<Integer> freArr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int value = entry.getValue();
            if (max == value) {
                count++;
                freArr.add(entry.getKey());
                maxkey = entry.getKey();

            }

        }
        if (count >= 2) {
            if (freArr.size() == inputNum) {
                System.out.println(intArr.get(1));
            } else if (freArr.size() == 1 || freArr.size() == 2) {
                System.out.println(freArr.get(0));
            } else {
                System.out.println(freArr.get(freArr.size() - 1));
            }
        } else {
            System.out.println(maxkey);
        }

        System.out.println(Collections.max(intArr) - Collections.min(intArr));
    }


}
