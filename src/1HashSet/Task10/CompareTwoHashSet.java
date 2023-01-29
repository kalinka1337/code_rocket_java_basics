package HashSet.Task10;

import java.util.HashSet;

public class CompareTwoHashSet
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
        words2.add("tree");
        words2.add("game");


        System.out.println("Original HashSet: " + words);
        System.out.println("Second HashSet: " + words2);

        HashSet<String> result_set = new HashSet<String>();
        for (String element: words){
            System.out.println(words2.contains(element) ? "Yes" : "No");
        }

    }
}
