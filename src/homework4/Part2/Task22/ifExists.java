package homework4.Part2.Task22;

import java.util.LinkedList;

public class ifExists
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

        String input = "beer";
        if(words.contains(input)){
            System.out.println("Word " + input + " is present in the linked list!");
        } else {
            System.err.println("Word " + input + " is NOT present in the linked list!");
        }
    }
}
