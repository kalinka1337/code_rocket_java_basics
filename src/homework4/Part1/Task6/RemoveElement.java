package homework4.Part1.Task6;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jonathan");
        names.add("Michael");;
        names.add("Joseph");

        System.out.println("List before removing: " + names);
        names.remove(2);
        System.out.println("List after removing: " + names);

    }
}
