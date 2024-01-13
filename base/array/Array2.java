package array;

public class Array2 {
    public static void main(String[] args) {
//        int[] students; // 배열 변수 선언
//        students = new int[5]; // int 가 5개 넣을 수 있는 그릇을 만든 것!
//        students = new int[]{90,80,70,60,50}; // int 가 5개 넣을 수 있는 그릇을 만든 것!
        int[] students = new int[]{90, 80, 70, 60, 50}; // 배열의 선언 + 생성 + 초기화
//        int[] students = {90, 80, 70, 60, 50}; // 배열의 선언 + 생성 + 초기화 이것도 되긴함 자바가 알아서 추론해줌

//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;
        for (int i = 0; i < students.length; i++) {
            System.out.println("student"+(i+1)+"의 점수 : " + students[i]);
        }

    }
}
