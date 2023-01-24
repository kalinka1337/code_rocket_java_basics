package homework4.Part2.Task15;

import java.util.Collections;
import java.util.LinkedList;

public class SwapLinkedList
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

        Collections.swap(words, 1, 5);
        System.out.println(words);
    }
}
