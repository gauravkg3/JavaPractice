package CodingShuttle.LinkedList;

public class AddTwoNumber {
    public static void main(String[] args) {

        Node head1 = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);

        head1.next = n1;
        n1.next = n2;

        Node head2 = new Node(9);
        Node n3 = new Node(4);

        head2.next = n3;
        Node ans = addTwoNumber(head1, head2);
        RemoveDuplicateElementFromLinkedList.printLinkedList(ans);
    }

    public static Node addTwoNumber(Node head1, Node head2) {
        Node head3 = reverseLinkedList(head1);
        Node head4 = reverseLinkedList(head2);

        Node ans = null;
        Node temp = null;
        int sum = 0;
        int carry = 0;
        int k = 0;
        while (head3 != null || head4 != null || carry != 0) {
            sum = carry;

            if (head3 != null) {
                sum += head3.data;
                head3 = head3.next;
            }

            if (head4 != null) {
                sum += head4.data;
                head4 = head4.next;
            }

            int num = sum % 10;
            carry = sum / 10;

// 			Node newNode=new Node(num);
// 			if(ans==null)
// 			{
// 			    ans=temp=newNode;
// 			}else{
// 			    temp.next=newNode;
// 			    temp=newNode;
// 			}
            ans = insertLinkedList(k, num, ans);
            k++;
        }
        Node finalAnswer = removeStartingZero(reverseLinkedList(ans));

        return finalAnswer;
    }

    public static Node insertLinkedList(int pos, int data, Node head) {
        Node newNodes = new Node(data);
        if (pos == 0) {
            newNodes.next = head;
            return newNodes;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newNodes.next = temp.next;
        temp.next = newNodes;
        return head;

    }

    public static Node reverseLinkedList(Node head) {

        if (head == null || head.next == null)
            return head;
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

    public static Node removeStartingZero(Node head) {
        while (head.data == 0 && head.next != null) {
            head = head.next;
        }
        return head;
    }

}



