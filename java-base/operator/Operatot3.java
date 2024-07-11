package operator;

public class Operatot3 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1 ;
        System.out.println("a = " + a);

        a += 1 ;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        ++a;
        System.out.println("a = " + a);

        // ++a 와 a++ 는 무슨 차이야 ?
        // ++a, a++ 이것만 단독을 사용하는 경우는 둘 다 똑같음
        int b = 0;

        System.out.println("a = " + a + ", b = " + b);

        b = ++a; // a 값을 먼저 증가 시켜 그리고 b를 초기화

        System.out.println("a = " + a + ", b = " + b);

        b = a++; // b를 a로 초기화해 그리고 a 값을 증가 시켜

        System.out.println("a = " + a + ", b = " + b);


    }
}
