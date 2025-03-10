/*Problem Statement
Problem Statement:
A stack is a linear data structure that follows the Last In, First Out (LIFO) principle, meaning that the last element added is the first one to be removed. The primary operations for a stack are:

push(x) → Add an element x to the top of the stack.
pop() → Remove and return the top element of the stack.
peek() → Return the top element without removing it.
isEmpty() → Check if the stack is empty.
We will implement a stack using an array (list) in Java, JavaScript, and Python.

Input/Output Example
scss
Copy
Edit
push(10)
push(20)
push(30)
pop()  -> 30
peek() -> 20
isEmpty() -> false*/
public class script {
    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    public script(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // Push an element onto the stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
        System.out.println("Pushed " + x);
    }

    // Pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek at the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        script stack = new script(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top Element: " + stack.peek()); // 20
        System.out.println("Is Empty? " + stack.isEmpty()); // false
    }
}
