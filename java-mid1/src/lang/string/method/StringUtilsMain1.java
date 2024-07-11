package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        String numStr = String.valueOf(num);
        String boolStr = String.valueOf(bool);
        String objStr = String.valueOf(obj);

        System.out.println("numStr = " + numStr);
        System.out.println("boolStr = " + boolStr);
        System.out.println("objStr = " + objStr);

//        문자  + @ -> 문자
        System.out.println("" + num);

//        toCharArray 메서드
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }

    }
}
