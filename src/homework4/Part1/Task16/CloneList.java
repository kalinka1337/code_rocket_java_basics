package homework4.Part1.Task16;

import java.util.ArrayList;
import java.util.List;

public class CloneList
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("First array list: " + words);

        List<String> clonedList = new ArrayList<>(words);
        System.out.println("Cloned array list: " + clonedList);



    }
}
