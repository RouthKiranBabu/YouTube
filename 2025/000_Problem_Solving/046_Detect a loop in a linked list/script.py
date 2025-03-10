class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

def detect_loop(head):
    slow, fast = head, head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next

        if slow == fast:
            return True  # Loop detected

    return False  # No loop

# Creating a linked list
head = Node(1)
head.next = Node(2)
head.next.next = Node(3)
head.next.next.next = Node(4)
head.next.next.next.next = Node(5)
head.next.next.next.next.next = head.next  # Creates a loop

print(detect_loop(head))  # Output: True
