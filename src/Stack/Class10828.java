package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class10828 {

    private static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(br.readLine());
        String cmd = "";
        int num = 0;

        for (int i = 0; i < inputNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cmd = st.nextToken();

            if (st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            if (cmd.equals("push")) {
                push(num);
            } else if (cmd.equals("top")) {
                top();
            } else if (cmd.equals("size")) {
                size();
            } else if (cmd.equals("empty")) {
                empty();
            } else if (cmd.equals("pop")) {
                pop();
            }
            num = 0;
        }
    }

    private static void pop() {
        if (stack.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(stack.get(stack.size() - 1));
            stack.remove(stack.size() - 1);
        }
    }

    private static void empty() {
        if (stack.size() == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void size() {
        int stackSize;
        stackSize = stack.size();
        System.out.println(stackSize);
    }

    private static void top() {
        if (stack.size() == 0) {
            System.out.println(-1);
        }else {
            int topInt;
            topInt = stack.get(stack.size() - 1);
            System.out.println(topInt);
        }
    }

    private static void push(int num) {
        stack.add(num);
    }

}
