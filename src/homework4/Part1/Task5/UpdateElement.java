package homework4.Part1.Task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UpdateElement
{
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Strawberries");
        fruits.add("Banana");
        fruits.add("Watermelon");

        System.out.println("Original List: " + fruits);

        int index = 3;
        String newWord = "Pineapple";

        fruits.set(3, newWord);
        System.out.println("List after updating element at index " + index + ": " + fruits);




    }
}
