package homework4.Part2.Task23;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Converter
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

        List<String> list = new ArrayList<String>(words);

        for(String str: list){
            System.out.println(str);
        }
    }
}
