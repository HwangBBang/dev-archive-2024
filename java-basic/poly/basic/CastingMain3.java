package poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();

        // 업 캐스팅 (자식 타입 -> 부모 타입)
        Parent parent1 = (Parent) child; // 업 캐스팅은 캐스팅 생략 권장
        Parent parent2 = child;

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
