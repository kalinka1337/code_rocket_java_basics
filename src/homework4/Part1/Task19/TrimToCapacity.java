package homework4.Part1.Task19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrimToCapacity
{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(10);
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("Array list: " + words);

        words.trimToSize();
        System.out.println("New Array size capacity: " + words.size());




    }
}
