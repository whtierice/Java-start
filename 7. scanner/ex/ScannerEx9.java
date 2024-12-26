package Scanner.ex;

import java.util.Scanner;

public class ScannerEx9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int all = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3 : 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();


            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String productName = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();
                input.nextLine();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();
                input.nextLine();

                all = all + (price * quantity);


                System.out.println("상품명: " + productName + " 가격: " + price + " 합계: " + (price * quantity));
            } else if (option == 2) {
                System.out.println("총 비용: " + all);
                all = 0;

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해 주세요.");
            }
        }
    }
}
