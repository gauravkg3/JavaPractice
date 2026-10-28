package CodingShuttle.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithGEtMinInO1 {

    public static void main(String[] args) {
        QueueWithGEtMinInO1 queueWithGEtMinInO1 = new QueueWithGEtMinInO1();
        queueWithGEtMinInO1.enqueue(10);
        queueWithGEtMinInO1.enqueue(20);

        System.out.println(queueWithGEtMinInO1.getMin());
        queueWithGEtMinInO1.dequeue();
        queueWithGEtMinInO1.enqueue(15);


        System.out.println(queueWithGEtMinInO1.getMin());
        queueWithGEtMinInO1.enqueue(10);
        System.out.println(queueWithGEtMinInO1.getMin());

    }

    Queue<Integer> queue = new LinkedList<>();
    ArrayDeque<Integer> deque = new ArrayDeque<>();

    public void enqueue(int data) {
        queue.offer(data);
        while (!deque.isEmpty() && deque.getLast() > data) {
            deque.pollLast();
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
        return deque.getFirst();
    }

}
