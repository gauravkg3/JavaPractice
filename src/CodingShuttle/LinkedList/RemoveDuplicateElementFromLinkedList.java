package CodingShuttle.LinkedList;

public class RemoveDuplicateElementFromLinkedList {
    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(4);
        Node n5 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        printLinkedList(n1);

        Node ans = deleteDuplicateElement(n1);
        printLinkedList(ans);

    }


    public static Node deleteDuplicateElement(Node head) {
        Node orginal = head;
        Node newHead = null;
        Node temp = head;

        while (orginal != null) {
            while (orginal.next != null && orginal.data == orginal.next.data) {
                orginal = orginal.next;
            }

            if (newHead == null) {
                newHead = temp = orginal;
            } else {
                temp.next = orginal;
                temp = orginal;
            }
            orginal = orginal.next;
        }
        return newHead;
    }

    public static void printLinkedList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

        System.out.println();
    }
}
