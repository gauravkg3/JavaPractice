package CodingShuttle.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(4);
        Node n4 = new Node(5);
        Node n5 = new Node(6);
        Node n6 = new Node(7);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        RemoveDuplicateElementFromLinkedList.printLinkedList(head);
        Node newNode = reverseLinkedListRecursively(head);
        RemoveDuplicateElementFromLinkedList.printLinkedList(newNode);

    }

    public static Node reverseLinkedListRecursively(Node head) {
        if (head == null || head.next == null) return head;

        Node headOfSuProblem = reverseLinkedListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return headOfSuProblem;
    }

    public static Node reverseLinkedList(Node head) {

        if (head == null || head.next == null) return head;
        Node prev = head;
        Node curr = head.next;
        head.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
