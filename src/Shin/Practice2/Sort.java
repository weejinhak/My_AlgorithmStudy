package Shin.Practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String revers_string = new StringBuilder(string).reverse().toString();

        if (string.equals(revers_string)) System.out.println("뒤집어도 같음");
        else System.out.println("뒤집으면 다름");

        char[] ch = {'A', 'C', 'Q', 'B'};

    }

}
