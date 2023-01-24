package homework4.Part1.Task20;

import java.util.ArrayList;

public class IncreaseCapacity
{
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(8);
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("Array list: " + words);

        int newSize = 10;
        words.ensureCapacity(newSize);
        System.out.println("New list capacity: " + words.size());
    }
}
