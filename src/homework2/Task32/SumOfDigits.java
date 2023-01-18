package homework2.Task32;

import java.util.*;

public class SumOfDigits
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        DigitCountFunction digitCountFunction = new DigitCountFunction();
        digitCountFunction.count(number);
    }



}
