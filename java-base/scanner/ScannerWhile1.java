package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("종료 : exit / 입력해주세요 :");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            }
            System.out.println("입력한 문자열 : "+input);

        }

    }
}
