package TreeSet.Task3;

import java.util.TreeSet;

public class AddAllElements
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Blue");
        treeSet.add("Brown");
        treeSet.add("Red");
        System.out.println("First TreeSet: " + treeSet);

        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("Black");
        treeSet2.add("Yellow");
        treeSet2.add("White");
        System.out.println("Second TreeSet: " + treeSet2);

        treeSet.addAll(treeSet2);
        System.out.println("Complete TreeSet: " + treeSet);
    }
}
