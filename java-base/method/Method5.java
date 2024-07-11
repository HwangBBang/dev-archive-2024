package method;

public class Method5 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. 메서드 호출 전, number : " + number);//5
        number = changeNum(number);
        System.out.println("4. 메서드 호출 후, number : " + number);//5
    }

    public static int changeNum(int number) {
        System.out.println("2. 메서드 내부에서 변경 전, number : " + number);//5
        number *= 2;
        System.out.println("3. 메서드 내부에서 변경 후, number : " + number);//10
        return number;

    }
}
