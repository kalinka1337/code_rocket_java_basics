package HashSet.Task6;

import java.util.HashSet;

public class CloneHashSet
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println(words);

        HashSet <String> clonedWords = new HashSet<String>();
        clonedWords = (HashSet)words.clone();

        System.out.println("The new HashSet: " + clonedWords);

    }
}
