package cond.ex;

public class CondEx1 {
/*학생의 점수를 기반으로 학점을 출력하는 자바 프로그램을 작성하자. 다음과 같은 기준을 따른다.
    90점 이상 "A"
    80점 이상 90점 미만 "B"
    70점 이상 80점 미만 "C"
    60점 이상 70점 미만 "D"
    60점 미만 "F"*/

    public static void main(String[] args) {
        int score = 0;
        char grade = 0;
        score = 55;

        if (score >= 90) {
            grade = 'A';
        } else if (80 <= score) {
            grade = 'B';
        } else if (70 <= score) {
            grade = 'C';
        } else if (60 <= score) {
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println("학점은 " + grade + "입니다.");
    }
}
