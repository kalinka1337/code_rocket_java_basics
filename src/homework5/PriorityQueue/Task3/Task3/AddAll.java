package homework5.PriorityQueue.Task3.Task3;

import java.util.PriorityQueue;

public class AddAll
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the first Priority Queue: " + queue);

        PriorityQueue<String> newQueue = new PriorityQueue<String>();
        newQueue.add("Grey");
        newQueue.add("Gold");
        newQueue.add("Orange");
        newQueue.add("Green");

        System.out.println("Elements of the second Priority Queue: " + newQueue);

        queue.addAll(newQueue);
        System.out.println("Complete Priority Queue: " + queue);
    }
}
