package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Daf");
        helloLombok.setAge(13);

        String name1 = helloLombok.getName();
        int age1 = helloLombok.getAge();

        System.out.println("name1 = " + name1);
        System.out.println("age1 = " + age1);
    }
}
