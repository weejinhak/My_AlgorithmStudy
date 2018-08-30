package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Class_10866 {

    static StringTokenizer st;
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        for (int i = 0; i < input; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            int cmdNum = 0;
            if (st.hasMoreTokens()) {
                cmdNum = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "push_back":
                    push_back(cmdNum);
                    break;
                case "push_front":
                    push_front(cmdNum);
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "pop_front":
                    pop_front();
                    break;
            }

        }


    }

    private static void pop_front() {
        if (deque.size() == 0) System.out.println(-1);
        else System.out.println(deque.removeFirst());
    }

    private static void pop_back() {
        if (deque.size() == 0) System.out.println(-1);
        else System.out.println(deque.removeLast());
    }

    private static void empty() {
        if (deque.size() == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void size() {
        System.out.println(deque.size());
    }

    private static void back() {
        if (deque.size() == 0) System.out.println(-1);
        else System.out.println(deque.getLast());
    }

    private static void front() {
        if (deque.size() == 0) System.out.println(-1);
        else System.out.println(deque.getFirst());
    }

    private static void push_front(int num) {
        deque.addFirst(num);
    }

    private static void push_back(int num) {
        deque.addLast(num);
    }

}
