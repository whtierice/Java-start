package array.ex;

import java.util.Scanner;
/*
사용자에게 5개의 정수를 입력받아 배열에 저장하고 입력순서와 반대로 출력. 쉼표를 사용해 구분하고 마지막에는 쉼표 생략
*/
public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i + 1 != numbers.length) {
                System.out.print(numbers[numbers.length - (i + 1)] + ", ");
            } else {
                System.out.println(numbers[numbers.length - (i + 1)]);
            }
        }
    }
}
