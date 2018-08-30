package Deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class Class_1021 {

    private static ArrayList<Integer> arrayList = new ArrayList<>();
    private static int leftCount;
    private static int rightCount;
    private static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int popNum = 0;

        if (st.hasMoreTokens()) {
            popNum = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < popNum; i++) {
            arrayList.add(Integer.parseInt(st.nextToken()));
        }

        while (!arrayList.isEmpty()) {
            if (deque.getFirst() == arrayList.get(0)) {
                deque.pollFirst();
                arrayList.remove(0);
            } else {
                Deque<Integer> deque2 = new ArrayDeque<>(deque);
                leftCount(deque);
                rightCount(deque2);

                answer += leftCount > rightCount ? rightCount : leftCount;

                deque.pollFirst();
                arrayList.remove(0);

            }
        }

        System.out.println(answer);

    }

    private static void leftCount(Deque<Integer> deque) {
        leftCount = 0;
        while (deque.getFirst() != arrayList.get(0)) {
            deque.addLast(deque.pollFirst());
            leftCount++;
        }
    }

    private static void rightCount(Deque<Integer> deque) {
        rightCount = 0;
        while (deque.getFirst() != arrayList.get(0)) {
            deque.addFirst(deque.pollLast());
            rightCount++;
        }
    }
}

