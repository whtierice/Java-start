package loop.ex;

public class MultiTable {

/*
    중첩 for문을 사용해 구구단 작성
*/

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
