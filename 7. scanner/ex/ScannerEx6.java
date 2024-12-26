package Scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요. (단, 종료를 입력하면 종료) ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                break;
            }

            System.out.print("나이를 입력하세요. ");
            int age = scanner.nextInt();
            scanner.nextLine(); // 버퍼에 남은 줄바꿈 문자 제거.

            /*nextInt()의 동작방식
            * 정수값만 읽음.
            * 숫자 다음에 있는 줄바꿈 문자(\n)은 읽지 않고 입력 버퍼에 남겨둚
            * 예시) "23\n" 입력, 23만 읽고 "\n"은 버퍼에 남김
            *
            * nextLine()의 동작방식
            * 한줄 전체를 읽음(줄바꿈 문자 포함)
            * 줄바꿈 문자를 만날 때까지 모든 문자를 읽음
            * 버퍼에 남아있는 줄바꿈 문자도 읽음
            *
            * 이에따라 다시 이름입력 단계로 갔을 때, nextLine()이 버퍼에 남아있던 "\n"을 읽고 다음단계로 진행(사용자가 이름을 입력하기도 전에 빈 문자열을 읽은 것)
            * */

            System.out.println("입력한 이름: " + name + ", 나이: " + age);


        }
        System.out.println("프로그램을 종료합니다.");

    }
}
