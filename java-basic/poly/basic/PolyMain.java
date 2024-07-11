package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("\nChild -> Child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)

        // 부모는 자식을 담을 수 있음
        System.out.println("\nParent -> Child");
        Parent poly = new Child();
        poly.parentMethod();
        //poly.childMethod(); // Parent 타입이 이기에 Child의 메서드 호출 불가

        // 자식은 부모를 담을 수 없음
        // Child poly2 = new Parent();

    }
}
