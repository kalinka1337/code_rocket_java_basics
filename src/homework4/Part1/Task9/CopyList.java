package homework4.Part1.Task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyList
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original list: " + numbers);

        List<Integer> numbersCopy = new ArrayList<>(numbers);
        System.out.println("Copied list: " + numbersCopy);

    }
}
