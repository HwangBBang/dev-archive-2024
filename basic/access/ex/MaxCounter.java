package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    MaxCounter(int max) {
        this.max = max;
    }
    public void increment() {
        // 검증 로직
        if (max <= count) {
            count = max;
            System.out.println("최대값에 도달했습니다. 더 이상 증가 할 수 없습니다.");
            return;
        }
        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }

}
