package homework3.Task1;

import java.util.*;
public class PositiveOrNegative
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
