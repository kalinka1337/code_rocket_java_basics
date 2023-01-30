package HashSet.Task3;

import java.util.HashSet;

public class GetNumberOfElements
{
    public static void main(String[] args) {
        HashSet<String> wordsSet = new HashSet<String>();
        wordsSet.add("Red");
        wordsSet.add("Blue");
        wordsSet.add("Black");
        wordsSet.add("Green");

        System.out.println("The size of the HashSet: " + wordsSet.size());
    }
}
