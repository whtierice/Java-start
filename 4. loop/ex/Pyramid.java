package loop.ex;

public class Pyramid {

/*
    int rows를 선언한 뒤, 이 수만큼 피라미드를 출력
*/

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
