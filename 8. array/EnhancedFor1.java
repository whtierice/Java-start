package array;

public class EnhancedFor1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println();

        // 향상된 for문, for each문 (배열의 처음부터 끝까지 탐색하고 싶을 때 간단하게 활용.)
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println();

        // for-each문을 사용할 수 없는 경우, 증가하는 index 값을 같이 출력할 필요가 있을 때;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + " 번의 결과는: " + numbers[i]);
        }
    }
}
