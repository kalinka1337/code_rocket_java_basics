package homework2.Task32;

public class DigitCountFunction
{
    public void count(int number){
        int sum = 0, digit;
        while(number > 0){
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits is: " + sum);
    }
}
