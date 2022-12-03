package chap04;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {90, 34, 78, 12, 56};
        int ins, cmp, temp;

        for (ins = 1; ins < a.length; ins++) {
            temp = a[ins];
            for (cmp = ins - 1; cmp >= 0; cmp--) {
                if (a[cmp] > temp) {
                    a[cmp + 1] = a[cmp];
                } else {
                    break;
                }
            }
            a[cmp + 1] = temp;
        }

        for (int i: a) {
            System.out.print(i + "\t");
        }
    }
}
