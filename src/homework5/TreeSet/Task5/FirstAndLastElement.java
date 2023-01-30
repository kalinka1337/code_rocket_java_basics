package TreeSet.Task5;

import java.util.TreeSet;

public class FirstAndLastElement
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        System.out.println("Original TreeSet: " + treeSet);

        Object first = treeSet.first();
        System.out.println("First element: " + first);

        Object last = treeSet.last();
        System.out.println("Last element: " + last);
    }
}
