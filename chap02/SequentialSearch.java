package chap02;

import java.util.Scanner;

public class SequentialSearch { // 2.2 선형 검색
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] a = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
        int pos = -1;
        System.out.print("x = ");
        int x = scn.nextInt();
        scn.close();

        for( int i = 0; i < a.length; i++ ) {
            if( x == a[i]) {
                pos = i;
                break;
            }
        }

        System.out.println(pos);
    }
}
