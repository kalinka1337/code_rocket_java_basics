package HashSet.Task4;

import java.io.StringBufferInputStream;
import java.util.HashSet;

public class EmptyHashSet
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println(words);
        words.clear();
        System.out.println(words);
    }
}
