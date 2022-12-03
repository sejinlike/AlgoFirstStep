package chap03;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) { // 이진 검색
        int a[] = {39, 41, 53, 55, 68, 72, 84, 88, 92, 97};
        int x, pos, left, middle, right;

        Scanner scn = new Scanner(System.in);
        System.out.print("x = ");
        x = scn.nextInt();
        scn.close();

        pos = -1;
        left = 0;
        right = a.length-1;

        while (pos == -1 && left <= right) {
            middle = (left + right) / 2;
            if (a[middle] == x) {
                pos = middle;
            } else if (a[middle] > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        System.out.println(pos);
    }
}
