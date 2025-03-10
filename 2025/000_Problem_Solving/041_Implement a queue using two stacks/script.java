/*Problem Statement
A queue follows the FIFO (First In, First Out) principle, while a stack follows LIFO (Last In, First Out). The challenge is to implement a queue using two stacks, stack1 and stack2.

Operations to implement:
enqueue(x): Insert an element x into the queue.
dequeue(): Remove the front element from the queue.
Example Input/Output
plaintext
Copy
Edit
Input:
enqueue(1)
enqueue(2)
enqueue(3)
dequeue() → returns 1
enqueue(4)
dequeue() → returns 2
dequeue() → returns 3
dequeue() → returns 4

Output:
1
2
3
4*/
import java.util.Stack;

public class script {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue operation
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        
        return stack2.pop();
    }

    public static void main(String[] args) {
        script q = new script();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); // 1
        q.enqueue(4);
        System.out.println(q.dequeue()); // 2
        System.out.println(q.dequeue()); // 3
        System.out.println(q.dequeue()); // 4
    }
}
/*Output
1
2
3
4*/