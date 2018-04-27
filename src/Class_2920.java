import java.util.Scanner;

public class Class_2920 {

    void method2920() {


        Scanner s = new Scanner(System.in);

        String asc = "1 2 3 4 5 6 7 8";
        String des = "8 7 6 5 4 3 2 1";

        String input = s.nextLine();

        if (input.equals(asc)) {
            System.out.println("ascending");
        } else if (input.equals(des)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        s.close();

    }

}
