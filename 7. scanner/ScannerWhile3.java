package Scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("0을 입력하기 전까지 누적되어 합이 계산됩니다\"");

        while (true) {
            System.out.print("숫자를 입력하세요.: ");
            int num = scanner.nextInt();


            if (num == 0) {
                break;
            }

            sum += num; // 0은 합계에 포함되지 않도록 조건문 다음에 작성하는 것이 논리적 흐름에 좋음

        }

        System.out.println("누계 = " + sum);
    }
}
