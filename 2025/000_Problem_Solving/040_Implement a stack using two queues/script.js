class StackUsingQueues {
    constructor() {
        this.q1 = [];
        this.q2 = [];
    }

    push(x) {
        this.q2.push(x);
        while (this.q1.length > 0) {
            this.q2.push(this.q1.shift());
        }
        [this.q1, this.q2] = [this.q2, this.q1];
    }

    pop() {
        if (this.q1.length === 0) throw new Error("Stack is empty");
        return this.q1.shift();
    }

    top() {
        if (this.q1.length === 0) throw new Error("Stack is empty");
        return this.q1[0];
    }

    isEmpty() {
        return this.q1.length === 0;
    }
}

// Example Usage
let stack = new StackUsingQueues();
stack.push(1);
stack.push(2);
stack.push(3);
console.log(stack.top()); // Output: 3
console.log(stack.pop()); // Output: 3
console.log(stack.top()); // Output: 2
console.log(stack.isEmpty()); // Output: false
