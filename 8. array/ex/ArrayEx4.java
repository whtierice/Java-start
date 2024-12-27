package array.ex;

import java.util.Scanner;
//사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성해보자

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int[] numbers = new int[5];

        System.out.println("정수를 5개 입력하세요:");
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
