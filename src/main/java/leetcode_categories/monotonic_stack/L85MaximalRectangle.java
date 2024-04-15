package leetcode_categories.monotonic_stack;

import java.util.Stack;

public class L85MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        int length = matrix[0].length;
        int[] sum = new int[length];
        int maximalRectangle = 0;
        Stack<Integer> stack = new Stack<>();
        for (char[] row : matrix) {
            for (int j = 0; j < length; j++) {
                sum[j] = row[j] == '0' ? 0 : sum[j] + row[j]-'0';
            }
            int k = 0;
            while (k < length) {
                if (stack.isEmpty() || sum[k] > sum[stack.peek()]) {
                    stack.push(k++);
                } else {
                    int top = stack.pop();
                    int area = sum[top] * (stack.isEmpty() ? k : k - 1 - stack.peek());
                    maximalRectangle = Math.max(area, maximalRectangle);
                }
            }
            while (!stack.isEmpty()) {
                int top = stack.pop();
                int area = sum[top] * (stack.isEmpty() ? k : k - 1 - stack.peek());
                maximalRectangle = Math.max(area, maximalRectangle);
            }
        }
        return maximalRectangle;
    }
}
