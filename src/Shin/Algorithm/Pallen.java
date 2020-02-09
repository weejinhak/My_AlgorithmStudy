package Shin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Pallen {

    public static void main(String[] args) throws IOException {

        //input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

        //array
        ArrayList<String> reverseArrayList = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();

        //string in array
        for (int i = 0; i < string.length(); i++) {
            arrayList.add(String.valueOf(string.charAt(i)));
            reverseArrayList.add(String.valueOf(string.charAt(i)));
        }

        Collections.reverse(reverseArrayList);

        if(arrayList.equals(reverseArrayList)){
            System.out.println("앞으로 해도 뒤로 해도 같음");
        }else{
            System.out.println("앞 뒤로 다름");
        }

    }
}
