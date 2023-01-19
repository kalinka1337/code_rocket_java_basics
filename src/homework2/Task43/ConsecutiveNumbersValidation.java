package homework2.Task43;

public class ConsecutiveNumbersValidation
{
    public static boolean checkConsecutive(int a, int b, int c){
        if (a == b - 1 && b == c - 1) {
            return true;
        }
        return false;
    }
}
