package loop.ex;

public class NestedEx3 {
    public static void main(String[] args) {
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

    }
}
}
