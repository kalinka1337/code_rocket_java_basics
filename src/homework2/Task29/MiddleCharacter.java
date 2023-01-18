package homework2.Task29;

import java.util.*;

public class MiddleCharacter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = input.nextLine();

        MiddleCharacterFunction middleCharacterFunction = new MiddleCharacterFunction();
        middleCharacterFunction.displayMiddleCharacter(string);
    }


}
