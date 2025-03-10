/*Problem Statement
A stack is a Last In First Out (LIFO) data structure, meaning the last element pushed onto the stack is the first to be popped off. A queue, on the other hand, is a First In First Out (FIFO) data structure.

We need to implement a stack using two queues with the following operations:

push(x): Adds an element x to the stack.
pop(): Removes and returns the top element of the stack.
top(): Returns the top element without removing it.
isEmpty(): Returns true if the stack is empty.
Example Input/Output
cpp
Copy
Edit
stack.push(1);
stack.push(2);
stack.push(3);
stack.top();   // Output: 3
stack.pop();   // Output: 3
stack.top();   // Output: 2
stack.isEmpty(); // Output: false

Summary
We implemented a stack using two queues in Java, JavaScript, and Python.
Push Operation: We use q2 to store the new element and transfer all elements from q1 to q2. Finally, we swap q1 and q2.
Pop Operation: We simply remove the front element of q1.
Top Operation: We return the front element of q1 without removing it.
Time Complexity:
push(x): O(n) (because we transfer elements from q1 to q2).
pop(), top(), and isEmpty(): O(1).
This method maintains a stack-like behavior while using two queues for the implementation.
This ensures that the Last In First Out (LIFO) property of the stack is maintained using queues that follow FIFO order. 🚀*/
import java.util.LinkedList;
import java.util.Queue;

public class script {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        script stack = new script();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top()); // Output: 3
        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.top()); // Output: 2
        System.out.println(stack.isEmpty()); // Output: false
    }
}
