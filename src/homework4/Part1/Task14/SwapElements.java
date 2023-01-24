package homework4.Part1.Task14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwapElements
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("List before swapping: " + words);
        Collections.swap(words, 2, 5);
        System.out.println("List after swapping: " + words);


    }
}
