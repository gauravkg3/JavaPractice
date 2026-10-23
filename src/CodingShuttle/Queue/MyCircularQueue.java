package CodingShuttle.Queue;

public class MyCircularQueue {

    int size;
    private int[] arr;
    int front;
    int rear;

    MyCircularQueue(int size) {
        this.size = size; //missed
        arr = new int[size];
        rear = front = -1;
    }

    public boolean isEmpty() {
        return front == -1; //missed
    }

    public boolean isFull() {

        if (rear == size - 1 && front == 0) return true;
        if (rear + 1 == front) return true;

        return false;
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("Element cannot be inserted,As Queue is full.");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
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
        front = (front + 1) % size;
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
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = front; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
        }


        System.out.println();
    }

}
