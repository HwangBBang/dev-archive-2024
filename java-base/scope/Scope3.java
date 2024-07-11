package scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        int temp = 0;

        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("in main m = " + m);
//        System.out.println("in for i = " + i); // 오류

    }
}
