package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Programmers_StringSort {

    public static void main(String[] args) {

        String[] strings = {"abce", "abcd", "cdx"};
        int n = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        List<String> list = new ArrayList<>();


        for (String s : strings) {
            list.add(s.charAt(n) + s);
        }

        Collections.sort(list);

        for(int i = 0 ; i < list.size();i++){
            strings[i] = list.get(i).substring(1,list.get(i).length());
        }

        for(String s : strings){
            System.out.println(s);
        }

    }

}
