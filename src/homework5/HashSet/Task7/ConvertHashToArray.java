package HashSet.Task7;

import java.util.HashSet;

public class ConvertHashToArray
{
    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>();
        words.add("plane");
        words.add("tree");
        words.add("game");

        System.out.println("Original HashSet: " + words);
        String[] new_array = new String[words.size()];
        words.toArray(new_array);

        System.out.println("Array elements: ");

        for(String element: new_array){
            System.out.println(element);
        }

    }
}
