package CodingShuttle.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {

    private Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) {
        StackUsingOneQueue stackUsingOneQueue = new StackUsingOneQueue();
        stackUsingOneQueue.push(10);
        stackUsingOneQueue.push(20);

        System.out.println(stackUsingOneQueue.pop());
        stackUsingOneQueue.push(30);

        System.out.println(stackUsingOneQueue.pop());
        stackUsingOneQueue.push(40);

        stackUsingOneQueue.push(50);

        System.out.println(stackUsingOneQueue.pop());
        System.out.println(stackUsingOneQueue.pop());
        System.out.println(stackUsingOneQueue.pop());

    }

    public void push(int data) {
        queue.offer(data);
    }

    public int pop() {
        if (queue.isEmpty()) return -1;
        int size = queue.size();

        for (int i = 0; i < size - 1; i++) {
            queue.offer(queue.poll());
        }

        return queue.poll();
    }
}
