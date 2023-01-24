package homework4.Part2.Task9;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertAnywhere
{
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("tree");
        words.add("can");
        words.add("juice");
        words.add("plane");
        words.add("beer");
        words.add("beetle");
        words.add("plane");
        words.add("bike");
        System.out.println("Linked list: " + words);

        Scanner input = new Scanner(System.in);
        System.out.println("Input an element you want to insert: ");
        String element = input.nextLine();
        System.out.println("Input the index where to insert: ");
        int index = input.nextInt();
        words.add(index, element);

        System.out.println("New linked list: " + words);
    }
}
