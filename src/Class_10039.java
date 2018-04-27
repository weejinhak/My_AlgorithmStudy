import java.util.Scanner;

public class Class_10039 {
    void method10039() {
        Scanner scanner = new Scanner(System.in);


        int[] intArr = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num < 40) {
                num = 40;
            }
            intArr[i] = num;
        }

        int avg=0;
        for (int i = 0; i < 5; i++) {
            avg+=intArr[i];
        }

        System.out.println(avg/5);

    }
}
