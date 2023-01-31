package homework5.PriorityQueue.Task8;

import java.util.PriorityQueue;

public class RetrieveFirstElement
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the first Priority Queue: " + queue);
        System.out.println("First element: " + queue.peek());
    }
}
