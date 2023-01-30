package HashSet.Task9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashToListArray
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println("Original HashSet: " + words);

        List<String> list = new ArrayList<String>(words);

        System.out.println("ArrayList contains: " + list);
    };
}
