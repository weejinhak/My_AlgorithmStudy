package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_5622 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int alpaCount = 0;
        String input = br.readLine().toUpperCase();
        String[] st = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            st[i] = String.valueOf(input.charAt(i));
        }

        for (int i = 0; i < st.length; i++) {
            System.out.println(st[i]);
        }

        for (int i = 0; i < st.length; i++) {
            if (st[i].equals("A") || st[i].equals("B") || st[i].equals("C")) {
                alpaCount += 3;
            } else if (st[i].equals("D") || st[i].equals("E") || st[i].equals("F")) {
                alpaCount += 4;
            } else if (st[i].equals("G") || st[i].equals("H") || st[i].equals("I")) {
                alpaCount += 5;
            } else if (st[i].equals("J") || st[i].equals("K") || st[i].equals("L")) {
                alpaCount += 6;
            } else if (st[i].equals("M") || st[i].equals("N") || st[i].equals("O")) {
                alpaCount += 7;
            } else if (st[i].equals("P") || st[i].equals("Q") || st[i].equals("R") || st[i].equals("S")) {
                alpaCount += 8;
            } else if (st[i].equals("T") || st[i].equals("U") || st[i].equals("V")) {
                alpaCount += 9;
            } else if (st[i].equals("W") || st[i].equals("X") || st[i].equals("Y") || st[i].equals("Z")) {
                alpaCount += 10;
            }
        }

        System.out.println(alpaCount);
    }

}
