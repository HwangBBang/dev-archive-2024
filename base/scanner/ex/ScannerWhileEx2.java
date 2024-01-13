package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("상품 가격을 입력하세요(-1 입력 종료): ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("상품 수량을 입력하세요: ");
            int volume = scanner.nextInt();
            System.out.println("총 비용은 " + volume*price);
        }
    }
}
