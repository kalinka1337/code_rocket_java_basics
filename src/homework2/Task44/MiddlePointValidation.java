package homework2.Task44;

public class MiddlePointValidation {
    public static boolean isMiddlePoint(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        return (a != min && a != max) || (b != min && b != max) || (c != min && c != max);
    }
}
