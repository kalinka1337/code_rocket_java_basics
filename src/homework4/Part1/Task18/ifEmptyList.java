package homework4.Part1.Task18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ifEmptyList
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
        System.out.println("List: " + words);

//        words = Collections.emptyList();
//        System.out.println("Emptied array list: " + words);

        if(words.isEmpty()){
            System.out.println("List is empty!");
        } else {
            System.out.println("List is not empty!");
        }
    }
}
