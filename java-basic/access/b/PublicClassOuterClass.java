package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default 접근제어자이기에 다른 패키지 클래스에서 접근을 못하게함
        // DefaultClass1 class1 = new DefaultClass();

    }
}
