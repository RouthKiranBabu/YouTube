"""Input/Output Example
push(10)
push(20)
push(30)
pop()  -> 30
peek() -> 20
isEmpty() -> false
"""
class Stack:
    def __init__(self):
        self.stack = []

    # Push an element onto the stack
    def push(self, item):
        self.stack.append(item)
        print(f"Pushed {item}")

    # Pop an element from the stack
    def pop(self):
        if self.is_empty():
            print("Stack Underflow")
            return None
        return self.stack.pop()

    # Peek at the top element of the stack
    def peek(self):
        if self.is_empty():
            print("Stack is empty")
            return None
        return self.stack[-1]

    # Check if the stack is empty
    def is_empty(self):
        return len(self.stack) == 0

# Example Usage
stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)
print("Popped:", stack.pop()) # 30
print("Top Element:", stack.peek()) # 20
print("Is Empty?", stack.is_empty()) # False
"""Summary of Code
Java: Uses an array with a fixed size, a top pointer, and explicit checks for stack overflow.
JavaScript: Uses an array (items[]) to store elements dynamically, avoiding the need for a fixed size.
Python: Uses a list (stack[]) for dynamic storage, similar to JavaScript.
Key Differences
Java requires manual array handling and capacity management.
JavaScript and Python use dynamic arrays (lists), making memory management easier.
All three implementations follow LIFO principles and support the fundamental stack operations: push, pop, peek, and isEmpty."""