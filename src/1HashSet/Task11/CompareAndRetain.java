package HashSet.Task11;

import java.util.HashSet;

public class CompareAndRetain
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("green");
        words.add("tree");
        words.add("game");

        HashSet<String> words2 = new HashSet<String>();
        words2.add("plane");
        words2.add("black");
        words2.add("fire");
        words2.add("game");

        System.out.println("Original HashSet: " + words);
        System.out.println("Second HashSet: " + words2);

        words.retainAll(words2);
        System.out.println("HashSet content: " + words);

    }
}
