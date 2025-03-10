class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None

    # Insert a node at the end of the list
    def insert(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            self.tail = new_node
            self.tail.next = self.head  # Circular link
        else:
            self.tail.next = new_node
            self.tail = new_node
            self.tail.next = self.head  # Maintain circular link

    # Display the circular linked list
    def display(self):
        if not self.head:
            print("List is empty")
            return
        temp = self.head
        output = ""
        while True:
            output += str(temp.data) + " -> "
            temp = temp.next
            if temp == self.head:
                break
        print(output + "(back to head)")

    # Delete a node by value
    def delete(self, key):
        if not self.head:
            return
        current = self.head
        prev = None
        while True:
            if current.data == key:
                if current == self.head:
                    self.head = self.head.next
                    self.tail.next = self.head  # Update circular link
                else:
                    prev.next = current.next
                    if current == self.tail:
                        self.tail = prev  # Update tail if last node is deleted
                return
            prev = current
            current = current.next
            if current == self.head:
                break

# **Main Execution Block**
if __name__ == "__main__":
    cll = CircularLinkedList()

    # Insert nodes
    cll.insert(10)
    cll.insert(20)
    cll.insert(30)

    # Display list
    print("Circular Linked List after insertions:")
    cll.display()

    # Delete a node
    cll.delete(20)
    print("Circular Linked List after deleting 20:")
    cll.display()
"""Circular Linked List after insertions:
10 -> 20 -> 30 -> (back to head)
Circular Linked List after deleting 20:
10 -> 30 -> (back to head)"""