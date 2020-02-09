package SW_Expert_Academy;


import java.util.Scanner;

public class Stack {
    static final int MAX = 100;
    static int top;
    static int[] stack = new int[MAX];

    static void stackInit() {
        top = 0;
    }

    static boolean stackIsFull() {
        return (top == MAX);
    }

    static boolean stackIsEmpty() {
        return (top == 0);
    }

    static boolean push(int num) {
        if (stackIsFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        top++;
        stack[top] = num;

        return true;
    }

    static Integer pop() {
        if (top == 0) {
            System.out.println("Stack is Empty");
            return null;
        }

        Integer popNum = stack[top];
        top--;
        return popNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int inputNum = sc.nextInt();
            stackInit();
            for (int i = 0; i < inputNum; i++) {
                if (!stackIsFull()) {
                    int val = sc.nextInt();
                    push(val);
                }
            }
            System.out.print("#" + test_case + " ");
            while (!stackIsEmpty()) {
                Integer val = pop();
                if (val != null) {
                    System.out.print(val + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
