package homework2.Task23;
import java.util.*;
public class AnagramDemo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first string: ");
        String string1 = input.nextLine();
        System.out.println("Input second string: ");
        String string2 = input.nextLine();


        Anagram anagram = new Anagram();
        anagram.checkStrings(string1, string2);
    }
}
