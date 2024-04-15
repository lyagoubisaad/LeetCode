package leetcode_categories.monotonic_stack;

import java.util.Stack;

public class L42TrappingRainWater {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        int sum = 0;
        while (i < height.length) {
            if(stack.isEmpty() || height[i] < height[stack.peek()]) {
                stack.add(i);
            } else {
                int val = stack.pop();
                if(stack.isEmpty()) continue;
                int container = Math.min(height[i], height[stack.peek()])-height[val];
                sum += container * (i - 1 - stack.peek());
            }
            i++;
        }
        return sum;
    }
}
