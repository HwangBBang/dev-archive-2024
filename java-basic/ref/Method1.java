package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);

        Student student2 = new Student();

        initStudent(student2,"학생2",16,80);

        printStudent(student1);
        printStudent(student2);
    }
    static void initStudent(Student student, String name, int age, int score) {
        student.name = name;
        student.age = age;
        student.score = score;
    }
    public static void printStudent(Student student) {
        System.out.print("이름:" + student.name);
        System.out.print(" 나이 :" + student.age);
        System.out.print(" 성적 :" + student.score);
        System.out.println();
    }
}
