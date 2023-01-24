package homework4.Part1.Task21;

import java.util.LinkedList;
import java.util.List;

public class ReplaceElement
{
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Strawberries");
        fruits.add("Banana");
        fruits.add("Watermelon");

        System.out.println("Original List: " + fruits);

        int index = 1;
        String newWord = "Pineapple";

        fruits.set(1, newWord);
        System.out.println("List after replacing element at index " + index + ": " + fruits);
    }
}
