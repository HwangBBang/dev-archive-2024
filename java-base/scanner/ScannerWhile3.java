package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("정수를 입력해주세요 ( 0 입력시 종료 ) :");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            int res = 0;
            for (int i = 1; i <= num; i++) {
                res += i;
            }
            System.out.println(num + "까지의 합은 : "+res);

        }

    }
}
