package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String [] studentNames = new String[] {"학생1", "학생2"};
        int [] studentScores = new int[] {90, 80};
        int[] studentAges = new int[] {15, 16};

        for (int i = 0; i < studentNames.length; i++) {
            printStudent(studentNames[i],studentScores[i],studentAges[i]);
        }
    }

    public static void printStudent(String name, int score, int age) {
        System.out.print("이름 : " + name);
        System.out.print(" 나이 : " + age);
        System.out.print(" 성적 : " + score);
        System.out.println();
    }
}
