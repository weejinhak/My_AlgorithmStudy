package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Class_1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int intputNum = Integer.parseInt(br.readLine());

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < intputNum; i++)
            hashSet.add(br.readLine());

        String[] array = new String[hashSet.size()];

        hashSet.toArray(array);

        Arrays.sort(array);

        Arrays.sort(array, Comparator.comparingInt(String::length));

        for (String s : array) {
            System.out.println(s);
        }
    }
}
