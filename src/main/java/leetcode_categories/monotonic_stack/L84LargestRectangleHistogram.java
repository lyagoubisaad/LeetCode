package leetcode_categories.monotonic_stack;

import java.util.Stack;

public class L84LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int largestArea = 0;
        while (i<heights.length) {
            if (stack.isEmpty() || heights[i] >= heights[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = heights[top] * (stack.isEmpty() ? i: i-1-stack.peek());
                largestArea = Math.max(largestArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights[top] * (stack.isEmpty() ? i: i-1-stack.peek());
            largestArea = Math.max(largestArea, area);
        }
        return largestArea;
    }
}
