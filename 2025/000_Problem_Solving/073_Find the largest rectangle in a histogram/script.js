/*
Explanation:
- A stack is used to maintain increasing bar heights.
- When a lower bar is encountered, pop elements from the stack and calculate area using the popped height.
- The process runs in O(n) time as each element is pushed and popped once.

Code:
*/

class script {
    static largestRectangleArea(heights) {
        let stack = [];
        let maxArea = 0;
        let n = heights.length;

        for (let i = 0; i <= n; i++) {
            let h = i === n ? 0 : heights[i];
            while (stack.length > 0 && h < heights[stack[stack.length - 1]]) {
                let height = heights[stack.pop()];
                let width = stack.length === 0 ? i : i - stack[stack.length - 1] - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}

// Example usage
let histogram = [2, 1, 5, 6, 2, 3];
console.log("Largest Rectangle Area:", script.largestRectangleArea(histogram));

/*
Output:
Largest Rectangle Area: 10
*/
