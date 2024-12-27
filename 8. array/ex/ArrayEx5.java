package array.ex;

import java.util.Scanner;
//이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자.

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        System.out.println("정수를 " + size + "개 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int number : numbers) {
            total += number;
        }

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + ((double) total / numbers.length));

    }
}
