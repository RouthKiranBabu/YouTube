class QueueUsingStacks:
    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def enqueue(self, x):
        self.stack1.append(x)

    def dequeue(self):
        if not self.stack1 and not self.stack2:
            raise Exception("Queue is empty")

        if not self.stack2:
            while self.stack1:
                self.stack2.append(self.stack1.pop())

        return self.stack2.pop()

# Test
q = QueueUsingStacks()
q.enqueue(1)
q.enqueue(2)
q.enqueue(3)
print(q.dequeue())  # 1
q.enqueue(4)
print(q.dequeue())  # 2
print(q.dequeue())  # 3
print(q.dequeue())  # 4
"""Summary
We use two stacks (stack1 and stack2) to simulate a queue.
enqueue(x): Simply pushes x onto stack1.
dequeue():
If stack2 is empty, we pop all elements from stack1 and push them into stack2.
We pop from stack2, ensuring FIFO order.
Time Complexity:
enqueue(x): O(1) (push operation).
dequeue(): O(1) amortized, since each element moves from stack1 to stack2 once.s"""