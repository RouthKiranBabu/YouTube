/*
 This JavaScript program removes duplicates from an unsorted singly linked list.
 It uses a Set to track seen values and eliminates duplicate nodes.
*/

class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class script {
    constructor() {
        this.head = null;
    }

    append(data) {
        if (!this.head) {
            this.head = new Node(data);
            return;
        }
        let current = this.head;
        while (current.next) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    removeDuplicates() {
        let seen = new Set();
        let current = this.head;
        let prev = null;

        while (current) {
            if (seen.has(current.data)) {
                prev.next = current.next; // Remove duplicate
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }

    printList() {
        let current = this.head;
        let output = "";
        while (current) {
            output += current.data + " -> ";
            current = current.next;
        }
        console.log(output + "null");
    }
}

// Creating and testing the linked list
let list = new script();
list.append(1);
list.append(2);
list.append(3);
list.append(2);
list.append(4);
list.append(1);

console.log("Original List:");
list.printList();

list.removeDuplicates();
console.log("List after removing duplicates:");
list.printList();

/*
 Output:
 Original List:
 1 -> 2 -> 3 -> 2 -> 4 -> 1 -> null
 List after removing duplicates:
 1 -> 2 -> 3 -> 4 -> null

 Explanation:
 - The program uses a Set to track unique values.
 - If a duplicate node is found, it is skipped by adjusting pointers.
 - The linked list remains with distinct elements.
*/
