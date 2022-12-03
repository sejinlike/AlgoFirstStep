package chap04;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 9, 1, 7, 6, 2, 4, 8};
        int i, j, temp;

        for (i = 1; i < a.length; i++) {
            temp = a[i];
            for (j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = temp;
        }

        for (int num: a) {
            System.out.print(num + "\t");
        }
    }
}
