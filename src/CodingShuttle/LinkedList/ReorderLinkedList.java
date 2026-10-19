package CodingShuttle.LinkedList;

public class ReorderLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        RemoveDuplicateElementFromLinkedList.printLinkedList(n1);
        Node ans = reorderLinkedList(n1);
        RemoveDuplicateElementFromLinkedList.printLinkedList(ans);

    }

    public static Node reorderLinkedList(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node l1 = head;
        Node l2 = ReverseLinkedList.reverseLinkedList(slow);


        while (true) {
            if (l1 == l2) {
                l1.next = null;
                break;
            }
            if (l2.next == null) {
                l1.next = l2;
                l2.next = null;
                break;
            }
            Node l1Next = l1.next;
            Node l2Next = l2.next;

            l1.next = l2;
            l2.next = l1Next;

            l1 = l1Next;
            l2 = l2Next;
        }

        return head;
    }
}
