package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a,b 는 " + a + "," + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a,b 는 " + a + "," + b);


    }
}
