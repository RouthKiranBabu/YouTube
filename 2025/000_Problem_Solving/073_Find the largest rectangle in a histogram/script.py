"""
Explanation:
- We use a stack to track the indices of histogram bars.
- We iterate through the heights array and maintain an increasing order in the stack.
- When a smaller bar is encountered, we pop from the stack, calculate the area, and update the max area.
- This ensures an efficient O(n) complexity.

Code:
"""

class script:
    @staticmethod
    def largestRectangleArea(heights):
        stack = []
        max_area = 0
        n = len(heights)

        for i in range(n + 1):
            h = 0 if i == n else heights[i]
            while stack and h < heights[stack[-1]]:
                height = heights[stack.pop()]
                width = i if not stack else i - stack[-1] - 1
                max_area = max(max_area, height * width)
            stack.append(i)
        
        return max_area

# Example usage
histogram = [2, 1, 5, 6, 2, 3]
print("Largest Rectangle Area:", script.largestRectangleArea(histogram))

"""
Output:
Largest Rectangle Area: 10
"""
