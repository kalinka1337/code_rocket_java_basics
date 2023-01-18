package homework2.Task31;

import java.util.*;
public class AllWords
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = input.nextLine();
        System.out.println("The total word count in this string is: " + WordCountingService.counting(string));
    }
}
