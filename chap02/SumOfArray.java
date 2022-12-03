package chap02;

public class SumOfArray { // 반복문과 배열의 기본
    public static void main(String[] args) {
        int[] a = { 72, 68, 92, 88, 41, 53, 97, 84, 39, 55 };
        int sum = 0;

        for(int i = 0; i < a.length; i++) {
            System.out.println("sum = " + sum + "i = " + i);
            sum += a[i];
        }

        System.out.println(sum);
    }
}
