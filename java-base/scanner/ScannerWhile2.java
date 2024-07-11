package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("종료를 원하신다면 num1 과 num2 에 0을 입력해주세요 ");
            System.out.print("num1 을 입력해주세요 :");
            int num1 = scanner.nextInt();

            System.out.print("num2 을 입력해주세요 :");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            int res = num1 + num2;
            System.out.println("두 수의 합은 : "+res);

        }

    }
}
