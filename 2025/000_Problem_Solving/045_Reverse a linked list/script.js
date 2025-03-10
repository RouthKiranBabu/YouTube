class ListNode {
    constructor(val) {
        this.val = val;
        this.next = null;
    }
}

function reverseList(head) {
    let prev = null;
    let current = head;

    while (current !== null) {
        let nextTemp = current.next; // Store next node
        current.next = prev; // Reverse the link
        prev = current; // Move prev forward
        current = nextTemp; // Move current forward
    }
    return prev;
}

function printList(head) {
    let current = head;
    let result = "";
    while (current !== null) {
        result += current.val + " → ";
        current = current.next;
    }
    console.log(result + "NULL");
}

// Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
let head = new ListNode(1);
head.next = new ListNode(2);
head.next.next = new ListNode(3);
head.next.next.next = new ListNode(4);
head.next.next.next.next = new ListNode(5);

console.log("Original List:");
printList(head);

head = reverseList(head);

console.log("Reversed List:");
printList(head);
/*Original List:
1 → 2 → 3 → 4 → 5 → NULL
Reversed List:
5 → 4 → 3 → 2 → 1 → NULL*/