package homework3.Task9;

import java.util.*;
public class LeapYear
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a year: ");
        int year = input.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeap) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is NOT a leap year");
        }
    }
}
