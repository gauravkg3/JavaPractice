package CodingShuttle.Queue;

import java.util.ArrayDeque;

public class QueueUsingTwoStacks {

    private ArrayDeque<Integer> stack1 = new ArrayDeque<>();
    private ArrayDeque<Integer> stack2 = new ArrayDeque<>();


    public void enqueue(int data) {
        stack1.push(data);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) return -1;
        if (!stack2.isEmpty()) {
            return stack2.pop();
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queueUsingTwoStacks = new QueueUsingTwoStacks();
        queueUsingTwoStacks.enqueue(1);
        queueUsingTwoStacks.enqueue(2);


        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());

        queueUsingTwoStacks.enqueue(3);
        queueUsingTwoStacks.enqueue(4);
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());

        queueUsingTwoStacks.enqueue(5);
        queueUsingTwoStacks.enqueue(6);
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());
        System.out.println(queueUsingTwoStacks.dequeue());
    }
}


