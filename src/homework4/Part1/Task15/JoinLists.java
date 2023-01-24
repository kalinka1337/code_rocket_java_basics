package homework4.Part1.Task15;

import java.util.ArrayList;
import java.util.List;

public class JoinLists
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("money");
        System.out.println(words);

        List<String> words2 = new ArrayList<>();
        words2.add("beer");
        words2.add("beetle");
        words2.add("plane");
        words2.add("bike");
        System.out.println(words2);

        words.addAll(words2);
        System.out.println("The conjoined list: " + words);
    }
}
