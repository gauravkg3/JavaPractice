package RoughPractice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithGetMinInO1 {

    public static void main(String[] args) {

    }

    Queue<Integer> queue = new LinkedList<>();
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    public void enqueue(int data) {

        queue.offer(data);
        while (!deque.isEmpty() && deque.peekLast() > data) {
            deque.pollLast(); //missed
        }

        deque.offerLast(data);

    }

    public int dequeue() {
        if (queue.isEmpty()) return -1;
        int temp = queue.poll();
        if (deque.getFirst() == temp) {
            deque.pollFirst();

        }
        return temp;
    }


    public int getMin() {
        return deque.peekFirst();
    }
}

