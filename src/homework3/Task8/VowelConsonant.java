package homework3.Task8;

import java.util.*;
public class VowelConsonant
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an alphabet: ");
        String string = input.nextLine();

        LetterValidationService letterValidationService = new LetterValidationService();
        letterValidationService.validate(string);
    }
}
