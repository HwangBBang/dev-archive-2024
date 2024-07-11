package loop;

public class While1_3 {
    public static void main(String[] args) {
        int count = 0;
        int endNum = 10;
        int result = 0;
        while (count < endNum){
            count += 1;
            result += count;
            System.out.println("현재 숫자는 : "+count +" | result는 : " + result);
        }

    }
}
