package array.ex;

import java.util.Scanner;
/*
사용자에게 5개의 정수를 입력받아 배열에 저장하고 입력순서대로 출력. 쉼표를 사용해 구분하고 마지막에는 쉼표 생략
*/
public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[5];

        System.out.println("5개의 정수를 입력하세요.");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        for (int j = 0; j < input.length; j++) {
            if(j != (input.length - 1) ) {
                System.out.print(input[j] + ", ");
            }
            else{
                System.out.println(input[j]);
            }
        }
    }
}
