package homework4.Part2.Task11;

import java.util.LinkedList;

public class DisplayElementsPositions
{
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("Linked list: " + words);

        for (int i = 0; i < words.size(); i++){
            System.out.println("Element at index " + i + ": " + words.get(i));
        }
    }
}
