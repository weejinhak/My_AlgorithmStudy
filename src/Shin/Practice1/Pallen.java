package Shin.Practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pallen {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String reversString = new StringBuilder(string).reverse().toString();

        if(string.equals(reversString)){
            System.out.println("true");
        }else System.out.println("false");

    }
}
