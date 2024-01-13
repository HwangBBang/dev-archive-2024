package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 20000;
        while (true) {
            printMenu();
            int option = sc.nextInt();
            if (option == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int amount = sc.nextInt();
                balance = deposit(balance, amount);
            } else if (option == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int amount = sc.nextInt();
                balance = withdraw(balance, amount);
            } else if (option == 3) {
                show(balance);
            } else if (option == 4) {
                System.out.println("프로그램 종료");
                return;
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
        }
    }

    public static void printMenu() {
        System.out.println("-------------------------------------");
        System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료 ");
        System.out.println("-------------------------------------");

        System.out.print("선택 : ");
        return;
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.print(amount + "원 을 입급하셨습니다.");
        System.out.println("현재 잔액 : "+ balance);
        return balance;
    }
    public static int withdraw(int balance, int amount) {
        if (balance < amount) {
            System.out.println(amount + "원 을 출금 실패 (사유 : 잔액 부족)");
        } else {
            balance -= amount;
            System.out.println(amount + "원 을 입급하셨습니다.");
        }
        System.out.println("현재 잔액 : "+ balance);
        return balance;
    }

    public static void show(int balance) {

        System.out.println("현재 잔액 : "+ balance);
        return;
    }


}
