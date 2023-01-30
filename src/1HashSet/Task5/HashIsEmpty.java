package HashSet.Task5;

import java.util.HashSet;

public class HashIsEmpty
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println(words);
        System.out.println(words.isEmpty());
        words.clear();
        System.out.println(words.isEmpty());
    }
}
