package homework4.Part1.Task8;

import java.util.*;

public class SortList
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(11);
        numbers.add(557);
        numbers.add(65);

        System.out.println(numbers);
        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);


    }
}
