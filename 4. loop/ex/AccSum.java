package loop.ex;

public class AccSum {

/*
    반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램을 작성해보세요. 이 때, sum이라는 변수를 사용하여 누적 합을 표현하고, i라는 변수를 사용하여 카운트를 수행해야 합니다. while 문, for 문 2가지 버전의 정답을 만들어야 합니다.
*/
    public static void main(String[] args) {
/*
        int i = 1;
        int max = 100;
        int sum = 0;

        while (i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);
*/

        int max = 100;
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
