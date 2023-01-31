package homework5.PriorityQueue.Task5;

import java.util.PriorityQueue;

public class RemoveAllElements
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the first Priority Queue: " + queue);
        queue.removeAll(queue);
        System.out.println("The new, Empty, Priority Queue: " + queue);
    }
}
