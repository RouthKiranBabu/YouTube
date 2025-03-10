/*
 * LRU (Least Recently Used) Cache implementation using Map in JavaScript.
 * The Map object maintains insertion order, allowing O(1) access time.
 * When adding a new key, if the cache exceeds its capacity, the least recently used entry is removed.
 */

class script {
    constructor(capacity) {
        this.capacity = capacity;
        this.cache = new Map();
    }

    get(key) {
        if (!this.cache.has(key)) return -1;
        const value = this.cache.get(key);
        this.cache.delete(key);
        this.cache.set(key, value); // Moves the accessed key to the end
        return value;
    }

    put(key, value) {
        if (this.cache.has(key)) {
            this.cache.delete(key);
        }
        this.cache.set(key, value);
        if (this.cache.size > this.capacity) {
            const firstKey = this.cache.keys().next().value;
            this.cache.delete(firstKey);
        }
    }

    printCache() {
        console.log([...this.cache.entries()]);
    }
}

// Example Usage
const cache = new script(3);

cache.put(1, "A");
cache.put(2, "B");
cache.put(3, "C");
cache.printCache(); // [[1, 'A'], [2, 'B'], [3, 'C']]

cache.get(1); // Moves 1 to the end
cache.put(4, "D"); // Removes the least recently used (2)
cache.printCache(); // [[3, 'C'], [1, 'A'], [4, 'D']]

cache.put(5, "E"); // Removes the least recently used (3)
cache.printCache(); // [[1, 'A'], [4, 'D'], [5, 'E']]

/*
 * Output:
 * [[1, 'A'], [2, 'B'], [3, 'C']]
 * [[3, 'C'], [1, 'A'], [4, 'D']]
 * [[1, 'A'], [4, 'D'], [5, 'E']]
 *
 * Explanation:
 * - Initially, the cache is filled with 3 elements.
 * - Accessing key 1 moves it to the end.
 * - Adding key 4 removes key 2 (least recently used).
 * - Adding key 5 removes key 3.
 */
