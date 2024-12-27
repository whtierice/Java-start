package array.ex;

// 이전 문제에서 학생수를 입력받도록 개선하자.

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int size = input.nextInt();

        String[] subjects = {"국어", "영어", "수학"};
        int[][] scores = new int[size][subjects.length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = input.nextShort();
            }
        }

/*          확인용 출력
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println(scores[i][j]);
*/

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println((i + 1) + "번 학생의 총점 " + sum + ", 평균: " + (double) sum / scores[i].length);

        }

    }
}