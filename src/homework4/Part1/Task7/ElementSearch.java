package homework4.Part1.Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElementSearch
{
    public static void main(String[] args) {
        Scanner search = new Scanner(System.in);
        System.out.println("Enter a word you want to find in an array: ");
        String word = search.nextLine();

        List<String> names = new ArrayList<>();
        names.add("Mike");
        names.add("Manny");
        names.add("Mikey");
        names.add("Michael");

        String elementToSearch = word;

        if (names.contains(elementToSearch)){
            System.out.println("The element " + elementToSearch + " is present in the list");
        } else {
            System.err.println("The element " + elementToSearch + " is NOT present in the list");
        }

    }
}
