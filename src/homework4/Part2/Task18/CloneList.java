package homework4.Part2.Task18;

import java.util.LinkedList;

public class CloneList
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

        LinkedList<String> wordsCloned = new LinkedList<>(words);
        System.out.println("New cloned linked list: " + wordsCloned);
    }
}
