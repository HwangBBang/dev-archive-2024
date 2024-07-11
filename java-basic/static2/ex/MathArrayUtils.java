package static2.ex;

public class MathArrayUtils {
    public static int sum(int [] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    public static double average(int [] arr) {
        return (double)sum(arr)/arr.length;
    }
    public static int min(int [] arr) {
        int com = arr[0];
        for (int i : arr) {
            if (com > i) {
                com = i;
            }
        }
        return com;
    }
    public static int max(int [] arr) {
        int com = arr[0];
        for (int i : arr) {
            if (com < i) {
                com = i;
            }
        }
        return com;
    }

}
