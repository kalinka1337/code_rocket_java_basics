package TreeSet.Task7;

import java.util.TreeSet;

public class NumberOfElements
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("The number of elements is: " + treeSet.size());

    }
}
