package array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("입력할 숫자의 갯수를 입력하세요 :");
//        int n = sc.nextInt();
        int students[][] = new int[4][3];
        String subject[] = {"국어", "영어", "수학"};
        int result[] = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + "점수 :");
                students[i][j] = sc.nextInt();
                result[i] += students[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print((i+1) + "번 학생의 총점 :" +result[i] );
            System.out.println(" ,평균 :" + (double) result[i] / 3);
        }

    }
}
