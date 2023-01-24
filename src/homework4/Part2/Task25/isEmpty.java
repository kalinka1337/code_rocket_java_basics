package homework4.Part2.Task25;

import java.util.LinkedList;

public class isEmpty
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

        System.out.println(words.isEmpty());
        words.removeAll(words);
        System.out.println(words.isEmpty());
        System.out.println("New empty list: " + words);

    }
}
