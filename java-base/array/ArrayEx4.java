package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 숫자의 갯수를 입력하세요 :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println(n+"개의 정수를 입력하세요 :");

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        sum = Arrays.stream(arr).sum();
        double avr = (double) sum / arr.length;

        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avr);


    }
}
