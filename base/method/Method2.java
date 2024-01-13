package method;

public class Method2 {
    public static void main(String[] args) {
        printHeader();
        boolean result = isOdd(3);
        System.out.println("result = " + result);
        printFooter();
    }

    public static void printHeader() {
        System.out.println("---프로그램 시작---");
        return;
    }
    public static void printFooter() {
        System.out.println("---프로그램 종료---");
        return;
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
