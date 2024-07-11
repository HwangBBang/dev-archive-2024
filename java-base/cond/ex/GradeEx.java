package cond.ex;

public class GradeEx {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade) {
            case "A":
                System.out.println("참 잘했어요");
                break;
            case "B":
                System.out.println("잘했어요");
                break;
            case "C":
                System.out.println("보통이에요");
                break;
            case "D":
                System.out.println("분발하세요");
                break;
            case "F":
                System.out.println("심각해요");
                break;
            default:
                System.out.println("잘못된 학점이에요");
        }


    }
}

