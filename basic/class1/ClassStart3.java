package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // x001
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.score = 90;

        Student student2; // x002
        student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.score = 80;

        printStudent(student1.name, student1.score, student1.age);
        printStudent(student2.name, student2.score, student2.age);


    }

    public static void printStudent(String name, int score, int age) {
        System.out.print("이름 : " + name);
        System.out.print(" 나이 : " + age);
        System.out.print(" 성적 : " + score);
        System.out.println();
    }
}
