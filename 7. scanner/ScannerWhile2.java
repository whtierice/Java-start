package Scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요.: ");
            double doubleValue1 = scanner.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요.: ");
            double doubleValue2 = scanner.nextDouble();

            if (doubleValue1 == 0 && doubleValue2 ==0) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }

            double sum = doubleValue1 + doubleValue2;
            System.out.println("합계: " + sum);
        }

    }
}
