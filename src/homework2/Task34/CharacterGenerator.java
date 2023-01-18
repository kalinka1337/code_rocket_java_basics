package homework2.Task34;

public class CharacterGenerator
{
    public static void printCharactersBetween(char start, char end){
        int count = 0;
        for(char c = start; c <= end; c++){
            System.out.printf(String.valueOf(c));
            count++;
            if (count % 20 == 0) {
                System.out.println();
            }
        }
    }
    public static void printFullRangeOfCharacters() {
        printCharactersBetween('(', '/');
        printCharactersBetween('0', '9');
        printCharactersBetween(':', '@');
        printCharactersBetween('A', 'Z');
        printCharactersBetween('[', '`');
        printCharactersBetween('a', 'z');
    }
}
