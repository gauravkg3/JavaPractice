package CodingShuttle.LinkedList;

public class CheckIfLLIsPalindrome {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node n1 = new Node(2);
        Node n2 = new Node(3);
        Node n3 = new Node(1);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(Node head) {


        Node middleNode = FindMiddleNodeInLinkendList.findMiddle(head);
        Node reverseMiddleLL = ReverseLinkedList.reverseLinkedList(middleNode);
        while (reverseMiddleLL != null) {
            if (head.data != reverseMiddleLL.data) {
                return false;
            } else {
                head = head.next;
                reverseMiddleLL = reverseMiddleLL.next;
            }
        }
        return true;
    }
}
