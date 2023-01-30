package TreeSet.Task10;

import java.util.TreeSet;

public class GetGreaterElement
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();;

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(19);
        treeSet.add(8);
        treeSet.add(9);

        System.out.println("Original TreeSet: " + treeSet);
        System.out.println("Greater than or equal to 7: " + treeSet.ceiling(7));
    }
}
