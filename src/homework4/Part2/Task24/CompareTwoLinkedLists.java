package homework4.Part2.Task24;

import javax.sound.sampled.Line;
import java.util.LinkedList;

public class CompareTwoLinkedLists
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

        System.out.println("Second linked list: " + words2);

        LinkedList<String> words3 = new LinkedList<String>();
        for(String e : words){
            words3.add(words2.contains(e) ? "YES" : "NO");
        }
        System.out.println(words3);

    }
}
