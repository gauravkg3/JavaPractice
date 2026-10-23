package CodingShuttle.Queue;

import java.util.ArrayDeque;

public class QueueUsingOneStack {

    private final ArrayDeque<Integer> stack = new ArrayDeque<>();

    public static void main(String[] args) {
        QueueUsingOneStack queueUsingOneStack = new QueueUsingOneStack();
        queueUsingOneStack.enqueue(1);
        queueUsingOneStack.enqueue(2);


        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());

        queueUsingOneStack.enqueue(3);
        queueUsingOneStack.enqueue(4);
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());

        queueUsingOneStack.enqueue(5);
        queueUsingOneStack.enqueue(6);
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());
        System.out.println(queueUsingOneStack.dequeue());
    }

    public void enqueue(int data) {
        stack.push(data);
    }

    public int dequeue() {

        if (stack.isEmpty()) return -1;
        if (stack.size() == 1) {
            return stack.pop();
        }

        int top = stack.pop();
        int ans = dequeue();
        stack.push(top);

        return ans;
    }
}
