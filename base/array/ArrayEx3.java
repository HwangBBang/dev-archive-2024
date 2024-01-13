package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // int 가 5개 넣을 수 있는 그릇을 만든 것!
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요 :");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        sum = Arrays.stream(arr).sum();
        System.out.println("sum = " + sum);
        double avr = (double) sum / arr.length;

        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avr);


    }
}
