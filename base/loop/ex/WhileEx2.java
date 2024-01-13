package loop.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int num = 0;
        int i = 0;

        while (i < 10) {
            num += 2;
            System.out.println("num = " + num);
            i++;
        }
    }
}
