package homework4.Part2.Task7;

import java.util.LinkedList;

public class InsertInFront
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

        words.add(0, "first");

        System.out.println("New linked list: " + words);
    }
}
