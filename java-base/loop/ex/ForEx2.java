package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
//        int num = 0;
//        for (int i = 0; i < 10; i++) {
//            num += 2;
//            System.out.println("num = " + num);
//
//        }
        for (int i = 0, num = 2; i < 10; i++, num += 2) {
            System.out.println("num = " + num);
        }
    }
}
