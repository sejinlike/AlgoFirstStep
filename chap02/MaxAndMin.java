package chap02;

public class MaxAndMin {
    public static void main(String[] args) { // 최대, 최소
        int max, min;
        int[] a = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
        max = a[0];
        min = a[0];

        for( int i = 0; i < a.length; i++ ) {
            if( max < a[i] ) {
                max = a[i];
            }
            if( min > a[i] ) {
                min = a[i];
            }
        }

        System.out.println("max = " + max + ", min = " + min);
    }
}
