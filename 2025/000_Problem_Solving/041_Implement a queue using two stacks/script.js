class QueueUsingStacks {
    constructor() {
        this.stack1 = [];
        this.stack2 = [];
    }

    enqueue(x) {
        this.stack1.push(x);
    }

    dequeue() {
        if (this.stack1.length === 0 && this.stack2.length === 0) {
            throw new Error("Queue is empty");
        }

        if (this.stack2.length === 0) {
            while (this.stack1.length > 0) {
                this.stack2.push(this.stack1.pop());
            }
        }

        return this.stack2.pop();
    }
}

// Test
const q = new QueueUsingStacks();
q.enqueue(1);
q.enqueue(2);
q.enqueue(3);
console.log(q.dequeue()); // 1
q.enqueue(4);
console.log(q.dequeue()); // 2
console.log(q.dequeue()); // 3
console.log(q.dequeue()); // 4
