// This JavaScript program merges two sorted linked lists into one sorted linked list.
// We use a dummy node to simplify pointer manipulations and construct the final list.

class ListNode {
    constructor(val = 0, next = null) {
        this.val = val;
        this.next = next;
    }
}

class script {
    static mergeTwoLists(l1, l2) {
        let dummy = new ListNode(-1);
        let current = dummy;

        while (l1 !== null && l2 !== null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Append remaining nodes from either list
        if (l1 !== null) current.next = l1;
        if (l2 !== null) current.next = l2;

        return dummy.next;
    }

    static printList(head) {
        let output = "";
        while (head !== null) {
            output += head.val + " -> ";
            head = head.next;
        }
        console.log(output + "null");
    }
}

// Creating two sorted linked lists
let l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
let l2 = new ListNode(2, new ListNode(4, new ListNode(6)));

let mergedHead = script.mergeTwoLists(l1, l2);
script.printList(mergedHead);

/*
Output:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

Explanation:
- The function iterates over both sorted lists, picking the smaller node at each step.
- A dummy node simplifies pointer management.
- The final list is printed in sorted order.
*/
