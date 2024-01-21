package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }

    private static void call(Parent parent) {
        if (parent instanceof Child child) { // JAVA 16에서는 instanceof 와 함께 변수선언(다운 캐스팅까지 한번에 가능)
            System.out.println("Child 인스턴스가 있음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스가 없음");
        }
    }
}
