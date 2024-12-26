package Scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

/*
사용자에게 첫 번째 숫자를 입력받으세요. 변수의 이름은 num1이어야 합니다.
두 번째 숫자를 입력받으세요. 변수의 이름은 num2 이어야 합니다.
만약 첫번째 숫자 num1이 두번째 숫자 num2보다 크다면 두 숫자를 임시변수를 활용하여 교환하세요.
num1부터 num2까지의 각 숫자를 출력하세요.
출력결과에 유의하세요. 각 숫자를 ,로 구분해서 출력해야합니다.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요.: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요.: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = 0;

            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i < num2) {
                System.out.print(" ,");
            }
        }
    }
}
