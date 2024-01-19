package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 정적 메서드가
        staticValue++; // 정적 변수에 접근
        staticMethod(); // 정적 메서드에 접근

        //instanceValue++;  // 인스턴스 변수에 접근 (컴파일 에러)
        //instanceMethod(); // 인스턴스 메서드에 접근 (컴파일 에러)
//     -->  만들어지지도않은 인스턴스를 어떻게 접근하겠다는거니 ?
    }

    public void instnaceCall() {
        // 인스턴스 메서드가

        staticValue++; // 정적 변수에 접근
        staticMethod(); // 정적 메서드에 접근
        instanceValue++;  // 인스턴스 변수에 접근
        instanceMethod();  // 인스턴스 메서드에 접근

    }
    private void instanceMethod() {
        // 인스턴스 메서드가 인스턴스 변수에 접근

        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        // 정적 메서드가 정적 변수에 접근
        System.out.println("staticValue = " + staticValue);
    }


}
