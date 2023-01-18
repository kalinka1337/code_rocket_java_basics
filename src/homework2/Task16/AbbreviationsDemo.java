package homework2.Task16;

import java.util.*;

public class AbbreviationsDemo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your full name with your middle name and Capital letters: ");
        String fullName = input.nextLine();

        Abbreviations abbreviations = new Abbreviations();
        abbreviations.refactoring(fullName);
    }
}
