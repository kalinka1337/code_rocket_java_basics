package TreeSet.Task6;

import java.util.TreeSet;

public class CloneTreeSet
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        System.out.println("Original TreeSet: " + treeSet);

        TreeSet cloned = new TreeSet();
        cloned = (TreeSet) treeSet.clone();
        System.out.println("Cloned set: " + cloned);
    }
}
