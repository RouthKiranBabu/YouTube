class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

function detectLoop(head) {
    let slow = head, fast = head;

    while (fast !== null && fast.next !== null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow === fast) return true; // Loop detected
    }
    return false; // No loop
}

// Creating a linked list
let head = new Node(1);
head.next = new Node(2);
head.next.next = new Node(3);
head.next.next.next = new Node(4);
head.next.next.next.next = new Node(5);
head.next.next.next.next.next = head.next; // Creates a loop

console.log(detectLoop(head)); // Output: true
