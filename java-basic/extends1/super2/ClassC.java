package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        //super(); ClassB가 기본 생성자가 아니기에 .. 생략 불가
        super(10 ,20);
        System.out.println("ClassC 생성자");
    }
}
