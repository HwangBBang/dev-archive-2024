package array;

public class Array3 {
    public static void main(String[] args) {

        // 4 x 5 인 2차원 배열을 만들기
        int cnt = 1;
        int[][] arr = new int[10][10];

/*
        int[][] arr = new int [][]{
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24}
        };
*/
/*
        int[][] arr = {
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24}
        };
 */

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = cnt;
                cnt++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
