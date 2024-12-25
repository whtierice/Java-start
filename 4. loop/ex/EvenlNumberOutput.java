package loop.ex;

public class EvenlNumberOutput {

/*
    반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때 num이라는 변수를 사용하여 수를 표현해야 합니다.
*/

    public static void main(String[] args) {

        // while문

/*
        int num = 2;
        int count = 1;
        while (count <= 10 ){
            System.out.println(num);
            num += 2;
            count++;
        }
*/

        // for문

        int num = 2;
        for (int count = 1; count <= 10; count++){
            System.out.println(num);
            num+=2;

        }
    }
}
