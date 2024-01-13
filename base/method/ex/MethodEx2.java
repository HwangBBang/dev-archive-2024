package method.ex;

public class MethodEx2 {
    public static void main(String[] args) {
        printMessage("hello", 3);
        printMessage("hwangbbang", 5);
        printMessage("bye", 7);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println( message);
        }
        return;
    }
}


