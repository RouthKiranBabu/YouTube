class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    constructor() {
        this.head = null;
        this.tail = null;
    }

    // Insert a node at the end of the list
    insert(data) {
        let newNode = new Node(data);
        if (!this.head) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.next = this.head; // Circular link
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            this.tail.next = this.head; // Maintain circular link
        }
    }

    // Display the circular linked list
    display() {
        if (!this.head) {
            console.log("List is empty");
            return;
        }
        let temp = this.head;
        let output = "";
        do {
            output += temp.data + " -> ";
            temp = temp.next;
        } while (temp !== this.head);
        console.log(output + "(back to head)");
    }

    // Delete a node by value
    delete(key) {
        if (!this.head) return;

        let current = this.head, prev = null;
        do {
            if (current.data === key) {
                if (current === this.head) {
                    this.head = this.head.next;
                    this.tail.next = this.head; // Update circular link
                } else {
                    prev.next = current.next;
                    if (current === this.tail) {
                        this.tail = prev; // Update tail if last node is deleted
                    }
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current !== this.head);
    }
}

// **Main Execution Block**
const cll = new CircularLinkedList();

// Insert nodes
cll.insert(10);
cll.insert(20);
cll.insert(30);

// Display list
console.log("Circular Linked List after insertions:");
cll.display();

// Delete a node
cll.delete(20);
console.log("Circular Linked List after deleting 20:");
cll.display();

/*Output
Circular Linked List after insertions:
10 -> 20 -> 30 -> (back to head)
Circular Linked List after deleting 20:
10 -> 30 -> (back to head)*/