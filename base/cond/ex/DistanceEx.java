package cond.ex;

public class DistanceEx {
    public static void main(String[] args) {
        int distance = 80;
        String word;
        if (distance <= 1) {
            word = "도보";
        } else if (distance <= 10) {
            word = "자전거";
        } else if (distance <= 100) {
            word = "자동차";
        } else  {
            word = "비행기";
        }
        System.out.println("출력 : "+word+"를 이용하세요.");
    }
}
