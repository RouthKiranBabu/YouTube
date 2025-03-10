/*Problem Statement
A Circular Linked List (CLL) is a linked list where the last node's next pointer points back to the first node instead of null (or None). This creates a circular structure.

Operations Implemented:

Insertion at the end
Display the list
Deletion of a node

Input Example
CircularLinkedList list = new CircularLinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.display();
list.delete(20);
list.display();

Output
10 -> 20 -> 30 -> (back to head)
10 -> 30 -> (back to head)
*/
public class script {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null;
    private Node tail = null;

    // Insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Circular link
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // Maintain circular link
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Delete a node by value
    public void delete(int key) {
        if (head == null) return;

        Node current = head, prev = null;
        do {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    tail.next = head; // Update circular link
                } else {
                    prev.next = current.next;
                    if (current == tail) {
                        tail = prev; // Update tail if last node is deleted
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // **Main method for execution**
    public static void main(String[] args) {
        script list = new script();
        
        // Insert nodes
        list.insert(10);
        list.insert(20);
        list.insert(30);

        // Display list
        System.out.println("Circular Linked List after insertions:");
        list.display();

        // Delete a node
        list.delete(20);
        System.out.println("Circular Linked List after deleting 20:");
        list.display();
    }
}
/*Output
Circular Linked List after insertions:
10 -> 20 -> 30 -> (back to head)
Circular Linked List after deleting 20:
10 -> 30 -> (back to head)
*/