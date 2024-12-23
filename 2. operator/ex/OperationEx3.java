package operator.ex;

public class OperationEx3 {

    /*int형 변수 score를 선언하세요.
    score가 80점 이상이고 100점 이하면 true를 출력하고, 아니면 false를 출력하세요*/

    public static void main(String[] args) {

        int score;
        score = 85;

        boolean b = 80 <= score && score <= 100;
        System.out.println(b);

        score = 79;

        b = 80 <= score && score <= 100;
        System.out.println(b);

        score = 101;

        b = 80 <= score && score <= 100;
        System.out.println(b);

    }
}
