package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
//
//        while (true) {
//            System.out.print("숫자를 입력하세요(종료는 -1): ");
//            int num = scanner.nextInt();
//            if (num == -1) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }
//            sum += num;
//            cnt++;
//        }
        int num;
        while ((num = scanner.nextInt()) != -1) {
            System.out.print("숫자를 입력하세요(종료는 -1): ");
            sum += num;
            cnt++;
        }
        double avg = (double) sum / cnt;

        System.out.println("입력한 수의 합 : " + sum);
        System.out.println("입력한 수의 평균 : " + avg);
    }
}






