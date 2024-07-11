package array;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // int 가 5개 넣을 수 있는 그릇을 만든 것!

        System.out.println("5개의 정수를 입력하세요 :");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("\n역순 출력");
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.print(arr[i]);
            if (i > 0) System.out.print(", ");
        }


    }
}
