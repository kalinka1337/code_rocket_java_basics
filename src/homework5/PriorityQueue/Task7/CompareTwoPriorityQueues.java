package homework5.PriorityQueue.Task7;

import java.util.PriorityQueue;

public class CompareTwoPriorityQueues
{
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Yellow");
        queue.add("Black");
        queue.add("Red");
        queue.add("Purple");

        System.out.println("Elements of the first Priority Queue: " + queue);

        PriorityQueue<String> newQueue = new PriorityQueue<String>();
        newQueue.add("Yellow");
        newQueue.add("Gold");
        newQueue.add("Red");
        newQueue.add("Purple");

        System.out.println("Elements of the second Priority Queue: " + newQueue);

        for(String word: queue){
            System.out.println(newQueue.contains(word) ? "Yes" : "No");
        }
    }
}
