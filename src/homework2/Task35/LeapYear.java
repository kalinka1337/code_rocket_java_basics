package homework2.Task35;

import java.util.*;
public class LeapYear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a year: ");
        int year = input.nextInt();

        if(isLeapYearFunction.isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
    }
}
