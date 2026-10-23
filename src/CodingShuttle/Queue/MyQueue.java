package CodingShuttle.Queue;

public class MyQueue {
    int size;
    private int[] arr;
    int front;
    int rear;


    MyQueue(int size) {
        this.size = size; //missed
        arr = new int[size];
        rear = front = -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1; //missed
    }


    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Element cannot be inserted,As Queue is full.");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear++;
        arr[rear] = data;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Element cannot be popped");

            return -1;  //missed
        }
        int temp = arr[front];

        if (front == rear) {
            rear = front = -1;
            return temp;
        }
        front++;
        return temp;
    }

    public int peek() {

        if (isEmpty()) {
            System.out.println("Element cannot be peeked");
            return -1; //missed
        }
        return arr[front];
    }

    public void printQueue() {

        if (isEmpty()) return; //missed
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
