package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("당신의 이름을 입력하세요: ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("당신의 나이를 입력하세요 : ");
            int age = scanner.nextInt(); // 10\n  입력되었을 때 nextInt 는 10만 가져간다.
            scanner.nextLine(); // \n 을 읽고 버려
            System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"살입니다.");
        }
    }
}
