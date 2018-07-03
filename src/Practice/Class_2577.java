package Practice;

import java.util.Scanner;

class Class_2577 {

    private static Scanner scanner = new Scanner(System.in);

    void method2577() {

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int result = A * B * C;


        String str = String.valueOf(result);
        int[] strArr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int n = Integer.parseInt(String.valueOf(str.charAt(i)));
            strArr[n] += 1;
        }

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

    }

}


