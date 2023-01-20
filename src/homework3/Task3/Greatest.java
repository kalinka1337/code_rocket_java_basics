package homework3.Task3;

import java.util.*;
public class Greatest
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int number1 = input.nextInt();
        System.out.println("Input the 2nd number: ");
        int number2 = input.nextInt();
        System.out.println("Input the 3rd number: ");
        int number3 = input.nextInt();

        GreatestNumberChecker greatestNumberChecker = new GreatestNumberChecker();
        greatestNumberChecker.check(number1, number2, number3);
    }
}
