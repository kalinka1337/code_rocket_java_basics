package homework4.Part2.Task19;

import java.util.LinkedList;

public class ReturnRemove
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

        System.out.println("Removed element: " + words.pop());
        System.out.println("New linked list: " + words);
    }
}
