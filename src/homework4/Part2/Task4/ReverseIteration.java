package homework4.Part2.Task4;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseIteration
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

        Collections.reverse(words);
        System.out.println(words);

        for(String word: words){
            System.out.println(word);
        }
    }
}
