package homework4.Part2.Task10;

import java.util.LinkedList;

public class FirstLastOccurence
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

        Object firstElement = words.getFirst();
        System.out.println("First element of the list is: " + firstElement);

        Object lastElement = words.getLast();
        System.out.println("Last elemenet of the list is: " + lastElement);



    }
}
