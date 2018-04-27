import java.util.Scanner;

public class Class_1152 {


    private static Scanner scanner = new Scanner(System.in);

    void matod1152() {

        String str = scanner.nextLine();

        String[] arrStr = str.split(" ");

        int len = arrStr.length;

        if (len > 0 && arrStr[0].equals("")) {
            len -= 1;
        }

        System.out.println(len);


    }
}
