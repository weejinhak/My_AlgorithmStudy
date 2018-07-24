package Searching_Rule;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ex_Sorting_Collection {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(data);
        for (int i = 0; i < n; i++) {
            System.out.println(data.get(i));
        }
    }

}
