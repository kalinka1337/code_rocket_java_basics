package homework4.Part1.Task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PortionOfElements
{
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println(words);

        Scanner input = new Scanner(System.in);
        System.out.println("Input first index: ");
        int firstIndex = input.nextInt();
        System.out.println("Input second index: ");
        int secondIndex = input.nextInt();

        List<String> subList = words.subList(firstIndex, secondIndex);
        System.out.println(subList);

    }
}
