/*
 * This program finds the middle element of a singly linked list using the two-pointer approach.
 * One pointer (slow) moves one step at a time, while the other (fast) moves two steps at a time.
 * When fast reaches the end, slow will be at the middle.
 */
class script {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middle = findMiddle(head);
        System.out.println("Middle element: " + (middle != null ? middle.data : "None"));
    }
}

/*
 * Output:
 * Middle element: 3
 *
 * Explanation:
 * The linked list: 1 -> 2 -> 3 -> 4 -> 5
 * The middle element is 3.
 */
