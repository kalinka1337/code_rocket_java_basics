package homework2.Task21;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Umbrella
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a string: ");
        String text = input.nextLine();


        WordLengthIdentifier wordLengthIdentifier = new WordLengthIdentifier();
        wordLengthIdentifier.stringLengthCheck(text);

    }


}
