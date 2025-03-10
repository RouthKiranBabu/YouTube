from collections import deque

class StackUsingQueues:
    def __init__(self):
        self.q1 = deque()
        self.q2 = deque()

    def push(self, x):
        self.q2.append(x)
        while self.q1:
            self.q2.append(self.q1.popleft())
        self.q1, self.q2 = self.q2, self.q1

    def pop(self):
        if not self.q1:
            raise Exception("Stack is empty")
        return self.q1.popleft()

    def top(self):
        if not self.q1:
            raise Exception("Stack is empty")
        return self.q1[0]

    def isEmpty(self):
        return len(self.q1) == 0

# Example Usage
stack = StackUsingQueues()
stack.push(1)
stack.push(2)
stack.push(3)
print(stack.top())  # Output: 3
print(stack.pop())  # Output: 3
print(stack.top())  # Output: 2
print(stack.isEmpty())  # Output: False
