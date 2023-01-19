package homework2.Task47;

public class EvenOrOddValidator
{
    public static boolean isEveryDigitEven(int num) {
        while (num > 0) {
            if ((num % 10) % 2 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
