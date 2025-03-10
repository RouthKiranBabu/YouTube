/*Problem Statement
A queue is a data structure that follows the FIFO (First In, First Out) principle. We need to implement a queue using an array in Java, JavaScript, and Python, supporting the following operations:

Enqueue (Add an element to the queue)
Dequeue (Remove an element from the queue)
Peek (View the front element)
isEmpty (Check if the queue is empty)
isFull (Check if the queue is full) [For fixed-size array]
Example
Input
plaintext
Copy
Edit
Queue size: 5
Operations: 
Enqueue(10), Enqueue(20), Enqueue(30)
Dequeue()
Peek()
Output
plaintext
Copy
Edit
Dequeued: 10
Front element: 20
*/
public class script {
    private int front, rear, size;
    private int capacity;
    private int[] queue;

    public script(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        script q = new script(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.peek());
    }
}
/*Output:
Enqueued: 10
Enqueued: 20
Enqueued: 30
Dequeued: 10
Front element: 20

Summary of Code
Java, JavaScript, and Python implementations use an array-based queue.
A fixed-size array is initialized to store elements.
We use two pointers (front and rear) to manage the queue.
Enqueue adds elements at the rear, while dequeue removes elements from the front.
Circular increment ((index + 1) % capacity) is used to maintain a circular queue behavior.
Checks for full and empty queues prevent errors.*/