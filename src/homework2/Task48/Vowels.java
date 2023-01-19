package homework2.Task48;

import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = input.nextLine();

        System.out.println("Check all the characters of the said string are vowels or not: " + VowelChecker.checkVowels(string));

    }
}
