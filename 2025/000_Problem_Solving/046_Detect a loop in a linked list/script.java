/*Problem Statement
Given a singly linked list, determine if it contains a loop (cycle). A cycle exists if a node is visited more than once while traversing the list.

Example Input & Output
Input:
Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 3 (cycle back to node 3)
Output:
true (Loop detected)

Approach - Floyd’s Cycle Detection Algorithm (Tortoise and Hare)
The most efficient way to detect a cycle in a linked list is by using Floyd’s Cycle Detection Algorithm, which uses two pointers:

Slow pointer moves one step at a time.
Fast pointer moves two steps at a time.
If there is a cycle, the fast pointer will eventually meet the slow pointer.
If there is no cycle, the fast pointer will reach the end of the list (null).*/
public class script {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean detectLoop(Node head) {
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true; // Loop detected
        }
        return false; // No loop
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next; // Creates a loop

        System.out.println(detectLoop(head)); // Output: true
    }

}
/*🔍 Summary
Floyd’s Cycle Detection Algorithm is used, with slow and fast pointers.
If slow == fast at any point, a loop exists.
If traversal ends (fast == null), no loop exists.
Time Complexity: O(n)
Space Complexity: O(1) (No extra space used)*/