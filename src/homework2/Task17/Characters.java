package homework2.Task17;

import java.util.*;

public class Characters
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = input.nextLine();

        CharacterFindingService characterFindingService = new CharacterFindingService();
        characterFindingService.counting(string);


    }
}
