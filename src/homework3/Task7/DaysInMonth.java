package homework3.Task7;

import java.util.*;
public class DaysInMonth
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a month number: ");
        int month = input.nextInt();
        System.out.println("Input a year: ");
        int year = input.nextInt();

        MonthYearConverter monthYearConverter = new MonthYearConverter();
        monthYearConverter.convert(month, year);

    }
}
