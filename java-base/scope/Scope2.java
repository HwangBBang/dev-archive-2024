package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        for (int i = 0; i < 2; i++) { // 블록 내부
            System.out.println("in for m = " + m);
            System.out.println("in for i = " + i);
        } // i 생존 종료
        System.out.println("in main m = " + m);
//        System.out.println("in for i = " + i); // 오류

    }
}
