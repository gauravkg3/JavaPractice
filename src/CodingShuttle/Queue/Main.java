package CodingShuttle.Queue;

public class Main {
    public static void main(String[] args) {
        MyCircularQueue queue = new MyCircularQueue(5);
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);


        queue.printQueue();

//        System.out.println(queue.peek());
//        queue.printQueue();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // System.out.println(queue.peek());
        queue.printQueue();

        queue.enqueue(66);
        queue.enqueue(67);
        queue.enqueue(67);

        queue.printQueue();

//        System.out.println(queue.isFull());
//        System.out.println(queue.dequeue());
//        queue.enqueue(11);
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        queue.printQueue();
//        System.out.println("_____");
////
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//
//        queue.enqueue(1);
//        System.out.println(queue.dequeue());
//
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.printQueue();

    }
}
