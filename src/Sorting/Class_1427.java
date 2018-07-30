package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Class_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < st.length(); i++) {
            arrayList.add(Integer.parseInt(String.valueOf(st.charAt(i))));
        }

        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        for (int i : arrayList) {
            System.out.print(i);
        }

    }

}
