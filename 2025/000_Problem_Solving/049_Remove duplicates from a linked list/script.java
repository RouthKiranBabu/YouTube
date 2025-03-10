/*
 This Java program removes duplicates from an unsorted singly linked list.
 It uses a HashSet to track seen values and eliminates duplicate nodes.
*/
import java.util.HashSet;

class script {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Function to remove duplicates from the linked list
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                prev.next = current.next; // Remove duplicate
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    // Function to insert a node at the end
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    // Function to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        script list = new script();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);
        list.append(1);

        System.out.println("Original List:");
        list.printList();

        list.removeDuplicates();
        System.out.println("List after removing duplicates:");
        list.printList();
    }
}

/*
 Output:
 Original List:
 1 -> 2 -> 3 -> 2 -> 4 -> 1 -> null
 List after removing duplicates:
 1 -> 2 -> 3 -> 4 -> null

 Explanation:
 The program maintains a HashSet to track unique values.
 If a duplicate is found, it removes that node from the linked list.
 This ensures only distinct elements remain in the list.
*/
