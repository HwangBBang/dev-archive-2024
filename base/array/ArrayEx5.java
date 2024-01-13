package array;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 숫자의 갯수를 입력하세요 :");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println(n+"개의 정수를 입력하세요 :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            min = (min < i) ? min : i;
            max = (max > i) ? max : i;
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
