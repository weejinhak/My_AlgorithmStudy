package Practice;

import java.util.Scanner;

public class Class_8958 {

    void method8958() {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String str = "";

        int[] intArr = new int[num];


        scanner.nextLine();

        for (int i = 0; i < num; i++) {

            str = scanner.nextLine();

            int count = 0;
            int score = 0;

            for (int j = 0; j < str.length(); j++) {
                if (String.valueOf(str.charAt(j)).equals("O")) {
                    score += 1;
                    count += score;
                } else if (String.valueOf(str.charAt(j)).equals("X")) {
                    score = 0;
                }
            }
            intArr[i] = count;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }


    }


}
