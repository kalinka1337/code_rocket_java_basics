package homework4.Part1.Task22;

import java.util.ArrayList;

public class ElementPositions
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

        int size = words.size();
        for(int i = 0; i < size; i++){
            System.out.println("Element at index " + i + ": " + words.get(i));
        }
    }
}
