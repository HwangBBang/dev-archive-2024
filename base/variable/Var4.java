package variable;

public class Var4 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~127 <- 실무에서 사용 X
        short s = 32767; // -32,768 ~ 32,767 <- 실무에서 사용 X
        int i = 2147483647; // -2147483648 ~ 2147483647
        long l = 9223372036854775807L;// -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //실수
        float f = 10.0f; // <- 실무에서 사용 X
        double d = 10.0;

        //문자하나
        char a = 'C'; //<- 실무에서 사용 X
        String c = "C";

    }
}
