package Shin.Practice;

public class Sort {

    void selectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    void bubbleSort(int a[]) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    void insertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i;
            while ((j > 0) && (a[j - 1]) > temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }

    void quickSort(int a[], int low, int high) {
        if (low >= high) {
            return;
        }
        int middle = low + (high - low) / 2;
        int pivot = a[middle];

        int i = low, j = high;
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(a, i, j);
                i++;
                j--;
            }
        }
        if (low < j) quickSort(a, low, j);
        if (high > i) quickSort(a, i, high);

    }

    void swap(int a[], int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

}
