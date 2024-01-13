package method;

public class Overloading2 {
    public static void main(String[] args) {
        System.out.println(add(1,3));
        System.out.println(add(4,5,6));
        System.out.println(add(3.1,7.99));
        System.out.println(add(3.3,7.3 ,5.5));

    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("3번 호출");
        return a + b ;
    }
    public static double add(double a, double b, double c) {
        System.out.println("4번 호출");
        return a + b + c;
    }
}
