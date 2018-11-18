package Sorting;

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

        //reverse string
        Collections.reverse(reverseArrayList);

        for(int i = 0 ; i < arrayList.size();i++){
            if(!arrayList.get(i).equals(reverseArrayList.get(i))){
                System.out.println("거꾸로 뒤집으면 다름");
                return;
            }
        }

        System.out.println("거꾸로 뒤집어도 같음");

    }
}
