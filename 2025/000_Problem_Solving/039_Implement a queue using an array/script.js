class Queue {
    constructor(capacity) {
        this.capacity = capacity;
        this.queue = new Array(capacity);
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    isFull() {
        return this.size === this.capacity;
    }

    isEmpty() {
        return this.size === 0;
    }

    enqueue(item) {
        if (this.isFull()) {
            console.log("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.queue[this.rear] = item;
        this.size++;
        console.log("Enqueued:", item);
    }

    dequeue() {
        if (this.isEmpty()) {
            console.log("Queue is empty");
            return null;
        }
        let item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size--;
        return item;
    }

    peek() {
        if (this.isEmpty()) {
            console.log("Queue is empty");
            return null;
        }
        return this.queue[this.front];
    }
}

// Example usage
let q = new Queue(5);
q.enqueue(10);
q.enqueue(20);
q.enqueue(30);
console.log("Dequeued:", q.dequeue());
console.log("Front element:", q.peek());
/*Enqueued: 10
Enqueued: 20
Enqueued: 30
Dequeued: 10
Front element: 20*/