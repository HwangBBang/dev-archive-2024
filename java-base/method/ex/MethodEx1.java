package method.ex;

public class MethodEx1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("평균 값 : " + printAverage(a, b, c));
        System.out.println("평균 값 : " + printAverage(15, 25, 35));
        System.out.println("평균 값 : " + printAverage(5.3, 25.4, 3.5));
    }


    public static double printAverage(double n1, double n2, double n3) {
        return n1 + n2 + n3 / 3;
    }
}
