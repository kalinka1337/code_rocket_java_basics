package homework4.Part2.Task21;

import java.util.LinkedList;

public class LastElement
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

        String last = words.peekLast();
        System.out.println(last);
    }
}
