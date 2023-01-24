package homework4.Part1.Task13;

import java.util.ArrayList;
import java.util.List;

public class CompareLists
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("bike");
        System.out.println(words);

        List<String> words2 = new ArrayList<>();
        words2.add("tree");
        words2.add("can");
        words2.add("juice");
        words2.add("bike");
        System.out.println(words2);

        boolean boolValue = words.equals(words2);
        System.out.println("The lists are equal: " + boolValue);

    }
}
