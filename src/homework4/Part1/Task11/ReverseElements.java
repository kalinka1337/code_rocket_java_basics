package homework4.Part1.Task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElements
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("beer");

        System.out.println(words);
        Collections.reverse(words);
        System.out.println(words);
    }
}
