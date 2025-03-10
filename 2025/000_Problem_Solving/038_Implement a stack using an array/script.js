/*Input/Output Example
push(10)
push(20)
push(30)
pop()  -> 30
peek() -> 20
isEmpty() -> false
*/
class Stack {
    constructor() {
        this.items = [];
    }

    // Push an element onto the stack
    push(element) {
        this.items.push(element);
        console.log(`Pushed ${element}`);
    }

    // Pop an element from the stack
    pop() {
        if (this.isEmpty()) {
            console.log("Stack Underflow");
            return null;
        }
        return this.items.pop();
    }

    // Peek at the top element of the stack
    peek() {
        if (this.isEmpty()) {
            console.log("Stack is empty");
            return null;
        }
        return this.items[this.items.length - 1];
    }

    // Check if the stack is empty
    isEmpty() {
        return this.items.length === 0;
    }
}

// Example Usage
let stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);
console.log("Popped:", stack.pop()); // 30
console.log("Top Element:", stack.peek()); // 20
console.log("Is Empty?", stack.isEmpty()); // false
