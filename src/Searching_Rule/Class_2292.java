package Searching_Rule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_2292 {

    //규칙찾기
    //1   -> 1
    //7   -> 2
    //19  -> 3
    //37  -> 4
    //61  -> 5
    public static void main(String[] args) throws IOException {

        //1  + 6 = 7
        //7  + 6 + 6 = 19
        //19 + 6 + 6 + 6 = 37
        //37 + 6 + 6 + 6  + 6 = 62
        int count = 1;
        int room = 1;
        int add = 6;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        while (true) {
            if (input <= room) {
                break;
            }
            room += add;
            add += 6;
            count++;
        }
        System.out.println(count);
    }


}
