package homework5.PriorityQueue.Task9;

import java.util.PriorityQueue;

public class RemoveLastElement
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the Priority Queue: " + queue);
        queue.poll();
        System.out.println("New Priority queue: " + queue);
    }
}
