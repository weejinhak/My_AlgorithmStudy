package Sorting;

public class Sorting {

    public static void main(String[] args) {
        //[선택정렬] 테스트//////////////
        System.out.println("=====[선택정렬]=====");
        int a[] = {68, 9, 32, 2, 14, 7, 31, 26};
        Sort s = new Sort();
        System.out.printf("\n정렬할 원소 :");
        for (int v : a) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.selectionSort(a);

        for (int v : a) {
            System.out.printf("%3d ", v);
        }
        ////////////////////////////

        //[버블정렬] 테스트 ///////////
        System.out.println();
        System.out.println("=====[버블정렬]=====");
        int b[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n정렬할 원소 :");
        for (int v : b) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.bubbleSort(b);

        for (int v : b) {
            System.out.printf("%3d ", v);
        }
        ////////////////////////////

        //[삽입정렬] 테스트
        System.out.println();
        System.out.println("=====[삽입정렬]=====");
        int c[] = {68, 9, 32, 2, 14, 7, 31, 26};
        System.out.printf("\n정렬할 원소 :");
        for(int v : c) {
            System.out.printf("%3d ", v);
        }
        System.out.println();
        s.insertionSort(c);

        for(int v : c) {
            System.out.printf("%3d ", v);
        }
        /////////////////////////////
    }

}

class Sort {

    //선택 정렬
    void selectionSort(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) { //오름차순
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }
    //버블 정렬
    void bubbleSort(int a[]) {
        for (int i = a.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    //삽입 정렬
    void insertionSort(int a[]){
        for(int i = 0 ; i < a.length;i++){
            int temp = a[i];
            int j = i;
            while((j>0)&&(a[j-1]>temp)){
                a[j] = a[j-1];
                j--;
            }
            a[j] =temp;
        }
    }



    void swap(int a[], int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
