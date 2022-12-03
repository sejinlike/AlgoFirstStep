package chap04;

public class MultiplicationTable {
    public static void main(String[] args) { // 다중 반복문
        int step, num;

        for(step = 1; step <= 9; step++) {
            System.out.print(step + "단 : ");
            for(num = 1; num <= 9; num++) {
                System.out.print(step * num + "\t");
            }
            System.out.println();
        }
    }
}
