package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance
            = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void anyMethod() {
        System.out.println("싱글톤 객체 메서드가 호출 되었습니다." );
    }
}
