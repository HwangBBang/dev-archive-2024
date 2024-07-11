package loop;

public class For2 {
    public static void main(String[] args) {
        int endNum = 14;
        int result = 0;
        for (int i = 0; i < endNum; i++) {
            result += i;
            System.out.println(i+1+" 번째 실행 "+"/ result = " + result);
        }
    }
}
