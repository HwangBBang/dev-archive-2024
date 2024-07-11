package extends1.super2;

public class ClassB extends ClassA{
    public ClassB(int a) {
        //super(); 기본 생성자는 생략 가능
        System.out.println("ClassB 생성자 a = " + a);
    }
    public ClassB(int a, int b) {
        //super(); 기본 생성자는 생략 가능
        System.out.print("ClassB 생성자 a = " + a);
        System.out.println(" b = " + b);
    }
}
