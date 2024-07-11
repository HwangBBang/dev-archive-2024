package array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrice = new int[10];
        int productCnt = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요 : ");
            int menu = sc.nextInt();

            if (menu == 1) {
                sc.nextLine();
                if (productCnt > 9) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요 : ");
                productNames[productCnt]= sc.nextLine();

                System.out.print("상품 가격을 입력하세요 : ");
                productPrice[productCnt] = sc.nextInt();
                productCnt++;
            } else if (menu == 2) {
                if (productCnt == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCnt; i++) {
                    System.out.println(productNames[i] +" : "+ productPrice[i]);
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료 합니다.");
                break;
            } else {
                System.out.println("잘못된 입력값 입니다.");
            }
        }



    }
}
