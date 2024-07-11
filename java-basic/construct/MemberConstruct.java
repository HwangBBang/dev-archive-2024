package construct;

public class MemberConstruct {
    String name;
    int age;
    int score;
    MemberConstruct(String name, int age) {
        this(name, age, 50);
        System.out.println("생성자 호출 name=" + name + ",age=" + age );
//        this.name = name;
//        this.age = age;
//        this.score = 50;
    }
    MemberConstruct(String name, int age, int score) {
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",score=" + score);
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
