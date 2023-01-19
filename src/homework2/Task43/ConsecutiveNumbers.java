package homework2.Task43;

import java.util.*;
public class ConsecutiveNumbers
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = input.nextInt();
        System.out.println("Input second number: ");
        int second = input.nextInt();
        System.out.println("Input third number: ");
        int third = input.nextInt();

        boolean isConsecutive = ConsecutiveNumbersValidation.checkConsecutive(first, second, third);
        System.out.println("The integers " + first + ", " + second + ", " + third + " are consecutive: " + isConsecutive);
    }
}
