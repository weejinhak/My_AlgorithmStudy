package SW_Expert_Academy;

import java.util.Scanner;

public class Stack {

    static final int MAX_N = 100;

    static int top;
    static int stack[] = new int[MAX_N];

    static void stackInit() {
        top = 0;
    }

    static boolean stackIsEmpty() {
        return (top == 0);
    }

    static boolean stackIsFull() {
        return (top == MAX_N);
    }

    static boolean stackPush(int value) {
        if (stackIsFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        stack[top] = value;
        top++;
        return true;
    }

    static Integer stackPop() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return null;
        }
        top--;
        return stack[top];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_cast = 1; test_cast <= T; test_cast++) {
            int N = sc.nextInt();
            stackInit();
            for (int i = 0; i < N; i++) {
                int value = sc.nextInt();
                stackPush(value);
            }
            System.out.print("#" + test_cast + " ");

            while (!stackIsEmpty()) {
                Integer value = stackPop();
                if (value != null) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
