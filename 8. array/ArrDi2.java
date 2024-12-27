package array;

public class ArrDi2 {

    public static void main(String[] args) {
        // 2 x 3인 2차원 배열을 만든다.
        int [][] arr = {
                {1,2,3},
                {4,5,6}
        };

/*
        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5;
        arr[1][2] = 6; // 1행 2열
*/

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
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
