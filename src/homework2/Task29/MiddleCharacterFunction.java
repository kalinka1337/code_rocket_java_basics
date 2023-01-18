package homework2.Task29;

public class MiddleCharacterFunction
{
    public static void displayMiddleCharacter(String input){
        int length = input.length();
        if (length % 2 == 0){
            int middleIndex = length / 2;
            System.out.println("The middle character in the string is: " + input.charAt(middleIndex - 1) + input.charAt(middleIndex));
        } else {
            int middleCharacters = length / 2;
            System.out.println("The middle characters in the string are: " + input.charAt(middleCharacters));
        }
    }
}
