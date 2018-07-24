package Searching_Rule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Class_2751 {

    private static int[] heapSort;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());

        heapSort = new int[n];

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            heapSort[i] = input;
        }

        buildMaxHeap();

    }

    public static void buildMaxHeap() {
        if (heapSort == null || heapSort.length < 1) {
            return;
        }
        for (int i = heapSort.length / 2; i >= 0; i--) {
            heapify(heapSort, i, heapSort.length);
        }
    }

    public static void heapify(int[] heapSort, int i, int length) {
        int largest = i;
        int leftIndex = 2 * i + 1;
        int rightIndex = 2 * i + 2;
        int temp = 0;

        if (leftIndex < length && heapSort[leftIndex] > heapSort[largest]) {
            largest = leftIndex;
        }
        if (rightIndex < length && heapSort[rightIndex] > heapSort[largest]) {
            largest = rightIndex;
        }
        if (largest != i) {
            temp = heapSort[largest];
            heapSort[largest] = heapSort[i];
            heapSort[i] = temp;

            heapify(heapSort, largest, length);
        }
    }
}
