package homework3.Task8;

public class LetterValidationService
{
    public void validate(String letter){
        if(letter.length() > 1){
            System.err.println("Error: Input must be a single letter!");
        } else if (Character.isAlphabetic(letter.charAt(0))){
            char c = letter.charAt(0);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                System.out.println("Input letter is a Vowel");
            } else {
                System.out.println("Input letter is a Consonant");
            }
        } else {
            System.err.println("Error: Input must be a letter.");
        }
    }
}
