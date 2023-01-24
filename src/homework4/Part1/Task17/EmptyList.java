package homework4.Part1.Task17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmptyList
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("Array list before emptying: " + words);

        words = Collections.emptyList();
        System.out.println("Emptied array list: " + words);


    }
}
