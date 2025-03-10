"""
This function finds the middle element of a singly linked list using two pointers.
The 'slow' pointer moves one step at a time, while the 'fast' pointer moves two steps.
When 'fast' reaches the end, 'slow' will be at the middle.
"""

class script:
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None

    @staticmethod
    def find_middle(head):
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        return slow

# Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
head = script.Node(1)
head.next = script.Node(2)
head.next.next = script.Node(3)
head.next.next.next = script.Node(4)
head.next.next.next.next = script.Node(5)

middle = script.find_middle(head)
print("Middle element:", middle.data if middle else "None")

"""
Output:
Middle element: 3

Explanation:
The linked list: 1 -> 2 -> 3 -> 4 -> 5
The middle element is 3.
"""
