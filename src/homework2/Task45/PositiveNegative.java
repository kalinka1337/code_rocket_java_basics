package homework2.Task45;

import java.util.*;
public class PositiveNegative
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num = input.nextInt();
//        int num = 1234;
        int firstDigit = PositiveNegativeNumberValidationService.extractFirstDigit(num);
        System.out.println("Input integer: " + num);
        System.out.println("Extract the first digit from the said integer: " + firstDigit);
    }
}
