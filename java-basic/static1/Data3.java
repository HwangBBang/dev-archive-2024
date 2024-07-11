package static1;

public class Data3 {
    public String name;
    public static int count;
    public Data3(String name) {
        this.name = name;
//        this.count++; 어떤 객체의 count 가 아니잖아.!  그러니 this 를 붙이면 안돼
        //Data3.count++;
        count++; // 위와 같은 의미 (Data3 은 내 클래스니까 생략 가능)
    }

}
