package TreeSet.Task2;

import java.util.TreeSet;

public class TreeSetIteration
{
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Red");
        treeSet.add("Orange");
        treeSet.add("Black");
        treeSet.add("Yellow");

        for(String tree: treeSet){
            System.out.println(tree);
        }
    }
}
