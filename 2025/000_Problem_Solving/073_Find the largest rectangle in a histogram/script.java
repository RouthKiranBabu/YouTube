/*
Explanation:
The problem is to find the largest rectangle area in a histogram given an array of heights.
- We use a stack to keep track of indices of the bars.
- If the current bar is higher than the bar at the stack’s top, we push it onto the stack.
- Otherwise, we pop from the stack, calculate the area with the popped height as the smallest height, and update the max area.
- This approach ensures each bar is pushed and popped at most once, giving O(n) time complexity.

Code:
*/

import java.util.Stack;

public class script {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] histogram = {2, 1, 5, 6, 2, 3};
        System.out.println("Largest Rectangle Area: " + largestRectangleArea(histogram));
    }
}

/*
Output:
Largest Rectangle Area: 10
*/
