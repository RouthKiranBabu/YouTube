"""
 This Python program removes duplicates from an unsorted singly linked list.
 It uses a set to track seen values and eliminates duplicate nodes.
"""
class script:
    class Node:
        def __init__(self, data):
            self.data = data
            self.next = None

    def __init__(self):
        self.head = None

    def append(self, data):
        if not self.head:
            self.head = self.Node(data)
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = self.Node(data)

    def remove_duplicates(self):
        seen = set()
        current = self.head
        prev = None

        while current:
            if current.data in seen:
                prev.next = current.next  # Remove duplicate
            else:
                seen.add(current.data)
                prev = current
            current = current.next

    def print_list(self):
        current = self.head
        output = ""
        while current:
            output += str(current.data) + " -> "
            current = current.next
        print(output + "null")

# Creating and testing the linked list
list = script()
list.append(1)
list.append(2)
list.append(3)
list.append(2)
list.append(4)
list.append(1)

print("Original List:")
list.print_list()

list.remove_duplicates()
print("List after removing duplicates:")
list.print_list()

"""
 Output:
 Original List:
 1 -> 2 -> 3 -> 2 -> 4 -> 1 -> null
 List after removing duplicates:
 1 -> 2 -> 3 -> 4 -> null

 Explanation:
 The program utilizes a set to keep track of unique values.
 If a duplicate value is found, that node is skipped by modifying pointers.
 The result is a linked list containing only distinct elements.
"""
