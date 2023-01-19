package homework2.Task42;

public class Digits
{
    public static void main(String[] args) {
        int num = 12541;
        System.out.println("Input number: " + num);
        int count = DigitCount.countTwoDigits(num);
        System.out.println("Output: " + count);
    }
}
