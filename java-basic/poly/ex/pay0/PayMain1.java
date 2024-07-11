package poly.ex.pay0;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("카카오 페이 : kakao\n네이버 페이 : naver\n토스  페이  : toss\n하나  페이  : hana\n종료       : exit\n결제 수단을 입력하시오 : ");
            String payOption = sc.nextLine();

            if(payOption.equals("exit"))return;

            System.out.print("결제하실 금액을 입력하시오 : ");
            int amount = sc.nextInt();sc.nextLine();

            payService.processPay(payOption, amount);
        }
    }
}

