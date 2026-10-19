package CodingShuttle.Stack;

public class StackUsingLinkendList {
    Node head;

    boolean isEmpty() {
        return head == null;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            Node temp = head;
            head = head.next;

            return temp.data;

        }
    }


    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return head.data;

        }
    }

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }
    }
}
