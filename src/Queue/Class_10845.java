package Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Class_10845 {

    private static ArrayList<Integer> queue = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < input; i++) {

            st = new StringTokenizer(br.readLine());

            String cmd = st.nextToken();
            int cmdNum = 0;

            if (st.hasMoreTokens()) {
                cmdNum = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "push":
                    push(cmdNum);
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
                case "pop":
                    pop();
                    break;
            }

        }

    }

    private static void push(int cmdNum) {
        queue.add(cmdNum);
    }

    private static void front() {
        if (queue.size() == 0)
            System.out.println(-1);
        else
            System.out.println(queue.get(0));
    }

    private static void back() {
        if (queue.size() == 0)
            System.out.println(-1);
        else
            System.out.println(queue.get(queue.size() - 1));
    }

    private static void size() {
        System.out.println(queue.size());
    }

    private static void empty() {
        if (queue.size() == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static void pop() {
        if (queue.size() == 0) {
            System.out.println(-1);
        } else {
            System.out.println(queue.get(0));
            queue.remove(0);
        }
    }
}
