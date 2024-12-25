package loop.ex;

public class NaturalNumberOutput {

/*
    처음 10개의 자연수를 출력하는 프로그램을 만들어 보세요. 이 때, count라는 변수를 사용해야합니다. while문 for문 2가지 버전의 정답을 만들어야 합니다.
*/

    public static void main(String[] args) {
/*        int count = 0;
        int i = 1;
        // while문

        while (count < 10 ){
            System.out.println(i);
            i++;
            count++;
        }*/

        // for문


        for (int count = 1; count <= 10; count++){
            System.out.println(count);

        }
    }
}
