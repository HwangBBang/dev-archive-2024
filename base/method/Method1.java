package method;

public class Method1 {
    public static void main(String[] args) {
/*    // 계산 1
        int a = 1;
        int b = 2;
        int sum1 = a + b;
        System.out.println(a + " + " + b + " = " + sum1);

        System.out.println("===============");

    // 계산 2
        int x = 6;
        int y = 7;
        int sum2 = x + y;
        System.out.println(x + " + " + y + " = " + sum2);
        */
        int sum1 = add(1, 5);
        System.out.println("계산 결과는 " + sum1);

        System.out.println("===============");

        int sum2 = add(13, 5);
        System.out.println("계산 결과는 " + sum2);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println(a + " + " + b + " =  ? ");

        return sum;
    }
}
