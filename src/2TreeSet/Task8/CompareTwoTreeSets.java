package TreeSet.Task8;

import java.util.TreeSet;

public class CompareTwoTreeSets
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        System.out.println("Original TreeSet: " + treeSet);

        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.add("Red");
        treeSet2.add("Blue"); //If input "Orange" then function = true
        treeSet2.add("Black");
        treeSet2.add("Yellow");

        boolean value = treeSet.equals(treeSet2);

        System.out.println("Complete set comparison verdict: " + value);

        for(String element: treeSet){
            System.out.println(treeSet2.contains(element) ? "Yes" : "No");
        }

    }
}
