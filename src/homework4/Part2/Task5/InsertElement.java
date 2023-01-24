package homework4.Part2.Task5;

import java.util.LinkedList;

public class InsertElement
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

        String element = "nature";
        int position = 2;

        words.add(2, "nature");

        System.out.println("New Linked List: " + words);


    }
}
