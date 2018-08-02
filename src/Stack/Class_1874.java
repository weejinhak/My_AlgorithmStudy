package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Class_1874 {

    private static ArrayList<Integer> stack = new ArrayList<>();
    private static int stackCount = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> arrayList = new ArrayList<>();

        int inputNum = Integer.parseInt(br.readLine());
        boolean bool = true;

        for (int i = 0; i < inputNum; i++) {
            int input = Integer.parseInt(br.readLine());
            for (int j = stackCount; j <= input; j++) {
                arrayList.add(push(j));
            }
            if (input == stack.get(high())) {
                arrayList.add(pop());
            } else {
                bool = false;
                System.out.println("NO");
                break;
            }
        }

        if (bool) {
            for (char i : arrayList) {
                System.out.println(i);
            }
        }

    }

    private static Character pop() {
        stack.remove(stack.size() - 1);
        return '-';
    }

    private static int high() {
        int high;
        high = stack.size() - 1;
        return high;
    }

    private static Character push(int j) {
        stack.add(j);
        stackCount++;
        return '+';
    }
}
