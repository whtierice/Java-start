package array.ex;

import java.util.Scanner;

public class ArrayEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxCount = 10;
        String[] productName = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int answer = scanner.nextInt();
            scanner.nextLine();

            if (answer == 1) {

                if (productCount == maxCount) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productName[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();
                scanner.nextLine();

                productCount++;
            } else if (answer == 2) {

                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }

                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] + ": " + productPrices[i] + "원");
                }
            } else if (answer == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("유효한 숫자를 입력해주세요.");
            }
        }
    }
}
