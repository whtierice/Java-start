package array;

public class ArrDi3 {

    public static void main(String[] args) {
        // 2 x 3인 2차원 배열을 만든다.
        int [][] arr = new int[2][31];

        int i = 1;
        // 순서대로 1씩 증가하는 값을 입력한다.

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++ ;
            }
        }

/*
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5;
        arr[1][2] = 6; // 1행 2열
*/

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }

/*
        // 0행 출력
        System.out.print(arr[0][0] + " "); // 0열 출력
        System.out.print(arr[0][1] + " "); // 1열 출력
        System.out.print(arr[0][2] + " "); // 2열 출력
        System.out.println(); // 한 행이 끝나면 라인을 변경한다

        // 1행 출력
        System.out.print(arr[1][0] + " "); // 0열 출력
        System.out.print(arr[1][1] + " "); // 1열 출력
        System.out.print(arr[1][2] + " "); // 2열 출력
        System.out.println(); // 한 행이 끝나면 라인을 변경한다
*/
    }
}
