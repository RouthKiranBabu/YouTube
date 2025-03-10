/*Problem Explanation
A linked list is a linear data structure where elements (nodes) are connected using pointers. The goal of this problem is to reverse a singly linked list such that the last node becomes the first and vice versa.

Example Input & Output
Input Linked List:
1 → 2 → 3 → 4 → 5 → NULL

Output Linked List:
5 → 4 → 3 → 2 → 1 → NULL*/
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class script {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextTemp = current.next; // Store next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev forward
            current = nextTemp; // Move current forward
        }
        return prev;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);
        
        head = reverseList(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
