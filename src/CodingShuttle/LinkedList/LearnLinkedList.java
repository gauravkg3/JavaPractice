package CodingShuttle.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {

        Nodes<Integer> head = new Nodes<>(2);
        Nodes<Integer> n1 = new Nodes<>(3);
        Nodes<Integer> n2 = new Nodes<>(5);
        Nodes<Integer> n3 = new Nodes<>(8);
        Nodes<Integer> n4 = new Nodes<>(16);

        head.next = n1;
        n1.prev = head;

        n1.next = n2;
        n2.prev = n1;

        n2.next = n3;
        n3.prev = n2;

        n3.next = n4;
        n4.prev = n3;

        printLinkedList(head);
//        Node<Integer> newNode = insertLinkedList(0, 4, head);
//        printLinkedList(newNode);

        Nodes<Integer> afterDeleteNodes = deleteNode(4, head);
        printLinkedList(afterDeleteNodes);
        printLinkedList(head);


    }

    public static void printLinkedList(Nodes<Integer> head) {
        Nodes<Integer> temp = head;

        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Nodes<Integer> insertLinkedList(int pos, int data, Nodes<Integer> head) {
        Nodes<Integer> newNodes = new Nodes(data);
        if (pos == 0) {
            newNodes.next = head;
            head.prev = newNodes;
            return newNodes;
        }

        Nodes<Integer> temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNodes.next = temp.next;
        temp.next.prev = newNodes;

        temp.next = newNodes;
        newNodes.prev = temp;

        return head;

    }

    public static Nodes<Integer> deleteNode(int pos, Nodes<Integer> head) {

        Nodes<Integer> curr = head;

        if (pos == 0) {
            head = head.next;
            head.prev = null;
            return head;
        }
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
//        Node<Integer> temp = curr.next;
//        curr.next = temp.next;
        curr.next = curr.next.next;
        curr.next.prev = curr;

        return head;
    }
}

class Nodes<E> {
    E value;
    Nodes<E> next;
    Nodes<E> prev;

    public Nodes(E value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
