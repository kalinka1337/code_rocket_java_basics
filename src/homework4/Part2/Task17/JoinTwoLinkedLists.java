package homework4.Part2.Task17;

import java.util.Collections;
import java.util.LinkedList;

public class JoinTwoLinkedLists
{
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        System.out.println("Linked list: " + words);

        LinkedList<String> words2 = new LinkedList<>();
        words2.add("beer");
        words2.add("beetle");
        words2.add("plane");
        words2.add("bike");
        System.out.println("Second Linked list: " + words2);

        words.addAll(words2);
        System.out.println(words);

    }
}
