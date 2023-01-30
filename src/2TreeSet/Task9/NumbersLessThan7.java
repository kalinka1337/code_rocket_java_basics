package TreeSet.Task9;

import java.util.Iterator;
import java.util.TreeSet;

public class NumbersLessThan7
{
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        TreeSet<Integer> treeHead = new TreeSet<Integer>();

        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(9);

        System.out.println("Original TreeSet: " + treeSet);

        treeHead = (TreeSet)treeSet.headSet(7);

        Iterator iterator;
        iterator = treeHead.iterator();

        System.out.println("Tree set data: ");
        while   (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

    }
}
