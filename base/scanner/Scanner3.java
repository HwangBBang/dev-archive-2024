package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("num1 을 입력해주세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("num2 을 입력해주세요 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("두 숫자 중 큰 수는  " + num1);
        } else if (num1 < num2) {
            System.out.println("두 숫자 중 큰 수는  " + num2);
        }else {
            System.out.println("두 숫자는 " + num1 + "로 같습니다. ");
        }


    }
}
