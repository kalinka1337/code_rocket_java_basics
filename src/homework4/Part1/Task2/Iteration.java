package homework4.Part1.Task2;

import java.util.ArrayList;
import java.util.List;
public class Iteration
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Numbers in the list: ");
        System.out.println(numbers);
        System.out.println();

        for(int number: numbers){
            System.out.println(number);
        }

    }
}
