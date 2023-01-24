package homework4.Part1.Task3;

import java.util.LinkedList;
import java.util.List;

public class FirstElementInArray
{
    public static void main(String[] args) {
        List<String> words = new LinkedList<>();
        words.add("Blue");
        words.add("in");
        words.add("the");
        words.add("the");
        words.add("ocean");
        words.add(1, "is");
        words.remove(3);
        System.out.println(words);

        for (String word: words){
            System.out.println(word);
        }

    }
}
