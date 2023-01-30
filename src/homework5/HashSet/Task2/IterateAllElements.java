package HashSet.Task2;

import java.util.HashSet;
import java.util.Iterator;

public class IterateAllElements {
    public static void main(String[] args) {
        HashSet<String> wordsSet = new HashSet<String>();
        wordsSet.add("Red");
        wordsSet.add("Blue");
        wordsSet.add("Black");
        wordsSet.add("Green");

        for (String s : wordsSet) {
            System.out.println(s);
        }
    }
}
