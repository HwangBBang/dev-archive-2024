package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        //data = new Data(); data 에는 참조값이 담겨있음 ,즉 final 이기에 참조값은 변경 불가
        data.value = 10; // final이지만, 참조값의 필드 값은 변경 가능
        data.value = 20;

    }
}
