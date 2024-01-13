package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//       printNum(number);
        printNum((int) number);
    }

    public static int printNum(int number) {
        System.out.println("숫자 : " + number);
        return number;

    }
}
