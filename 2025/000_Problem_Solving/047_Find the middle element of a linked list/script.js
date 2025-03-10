/*
 * This function finds the middle of a singly linked list using two pointers.
 * The 'slow' pointer moves one step at a time, while the 'fast' pointer moves two steps.
 * When 'fast' reaches the end, 'slow' will be at the middle.
 */

class script {
    constructor(value) {
        this.value = value;
        this.next = null;
    }

    static findMiddle(head) {
        let slow = head, fast = head;
        while (fast !== null && fast.next !== null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

// Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
let head = new script(1);
head.next = new script(2);
head.next.next = new script(3);
head.next.next.next = new script(4);
head.next.next.next.next = new script(5);

let middle = script.findMiddle(head);
console.log("Middle element:", middle ? middle.value : "None");

/*
 * Output:
 * Middle element: 3
 *
 * Explanation:
 * The linked list: 1 -> 2 -> 3 -> 4 -> 5
 * The middle element is 3.
 */
