package method;

public class Method4 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. 메서드 호출 전, number : " + number);//5
        changeNum(number);
        System.out.println("4. 메서드 호출 후, number : " + number);//5
    }

    public static void changeNum(int number) {
        System.out.println("2. 메서드 내부에서 변경 전, number : " + number);//5
        number *= 2;
        System.out.println("3. 메서드 내부에서 변경 후, number : " + number);//10

    }
}
