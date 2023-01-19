package homework2.Task42;

public class DigitCount
{
    public static int countTwoDigits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

}
