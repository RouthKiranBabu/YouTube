class ListNode:
    def __init__(self, val=0):
        self.val = val
        self.next = None

def reverse_list(head):
    prev = None
    current = head

    while current:
        next_temp = current.next  # Store next node
        current.next = prev  # Reverse the link
        prev = current  # Move prev forward
        current = next_temp  # Move current forward

    return prev

def print_list(head):
    current = head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("NULL")

# Creating linked list: 1 -> 2 -> 3 -> 4 -> 5 -> NULL
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

print("Original List:")
print_list(head)

head = reverse_list(head)

print("Reversed List:")
print_list(head)
"""Original List:
1 -> 2 -> 3 -> 4 -> 5 -> NULL
Reversed List:
5 -> 4 -> 3 -> 2 -> 1 -> NULL"""