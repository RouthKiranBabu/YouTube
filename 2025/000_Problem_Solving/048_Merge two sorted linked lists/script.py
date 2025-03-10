# This Python program merges two sorted linked lists into one sorted linked list.
# A dummy node is used to simplify merging and pointer management.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class script:
    @staticmethod
    def mergeTwoLists(l1, l2):
        dummy = ListNode(-1)
        current = dummy

        while l1 and l2:
            if l1.val < l2.val:
                current.next = l1
                l1 = l1.next
            else:
                current.next = l2
                l2 = l2.next
            current = current.next

        # Append remaining nodes from either list
        current.next = l1 if l1 else l2

        return dummy.next

    @staticmethod
    def printList(head):
        while head:
            print(head.val, end=" -> ")
            head = head.next
        print("null")

# Creating two sorted linked lists
l1 = ListNode(1, ListNode(3, ListNode(5)))
l2 = ListNode(2, ListNode(4, ListNode(6)))

mergedHead = script.mergeTwoLists(l1, l2)
script.printList(mergedHead)

"""
Output:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null

Explanation:
- The two sorted linked lists are merged efficiently.
- A dummy node is used to simplify pointer manipulation.
- The final linked list remains sorted and prints as expected.
"""
