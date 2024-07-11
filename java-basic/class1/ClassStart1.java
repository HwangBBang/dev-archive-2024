package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Score = 90;
        int student1Age = 15;

        String student2Name = "학생2";
        int student2Score = 80;
        int student2Age = 16;

        printStudent(student1Name,student1Score,student1Age);
        printStudent(student2Name,student2Score,student2Age);
    }

    public static void printStudent(String name, int score, int age) {
        System.out.print("이름 : " + name);
        System.out.print(" 나이 : " + age);
        System.out.print(" 성적 : " + score);
        System.out.println();
    }
}
