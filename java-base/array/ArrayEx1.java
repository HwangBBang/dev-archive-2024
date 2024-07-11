package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{90,80,70,60,50}; // int 가 5개 넣을 수 있는 그릇을 만든 것!

        int sum = 0;
        for (int student : students) {
            sum += student;
        }
        double avr = (double) sum / students.length;
        System.out.println("점수 총합 : " + sum);
        System.out.println("점수 평균 : " + avr);



    }
}
