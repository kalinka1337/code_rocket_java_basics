package homework2.Task47;
import java.util.*;

public class EvenOrOdd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number: ");
        int number = input.nextInt();

        boolean isEveryDigitEven = EvenOrOddValidator.isEveryDigitEven(number);
        System.out.println("Input integer: " + number);
        System.out.println("Check whether every digit of the said integer is even or not! " + isEveryDigitEven);
    }
}

