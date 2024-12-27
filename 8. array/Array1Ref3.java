package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 특정 값을 넣어서 초기화

        // int [] students = new int[5]; 처럼 선언과 생성을 한번에 가능.

        // 변수값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;
        
        int max = students[0];

        // 변수 값 사용, 반복문을 사용하여 코드 간소화
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i+1)+ " 점수: " + students[i]);
        }
/*
        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
*/
    }
}
