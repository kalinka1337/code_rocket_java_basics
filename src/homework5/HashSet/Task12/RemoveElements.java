package HashSet.Task12;

import java.util.HashSet;

public class RemoveElements
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("green");
        words.add("tree");
        words.add("game");

        System.out.println("Original HashSet: " + words);
        words.clear();
        System.out.println("Cleared HashSet: " + words);
    }
}
