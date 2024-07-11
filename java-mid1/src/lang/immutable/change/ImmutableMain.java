package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObj obj0 = new ImmutableObj(10);
        ImmutableObj obj1 = obj0.add(20);

        System.out.println(obj0);
        System.out.println(obj1);
    }
}
