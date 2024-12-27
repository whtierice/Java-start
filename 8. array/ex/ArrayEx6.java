package array.ex;

//사용자로부터 n개의 정수를 입력받아 배열에 저장한 후 배열 내에서 가장 큰 수를 찾아 출력하는 프로그램을 작성하자.

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 정수의 숫자를 입력하세요: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println(size + "개의 정수를 입력하세요.");
        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];


        for (int number : numbers) {
            if (number > max) {
                max = number;
            }

            if (number < min){
                min = number;
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);

    }
}
