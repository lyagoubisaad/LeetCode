package leetcode_categories.monotonic_stack;

import java.util.Stack;

public class L_1856_MaximumSubarrayMinProduct {
    public int maxSumMinProduct(int[] nums) {
        long[] dp = new long[nums.length+1];
        for (int i=0;i<nums.length;i++) {
            dp[i+1] = dp[i] + nums[i];
        }
        Stack<Integer> stack = new Stack<>();
        long res = 0;
        for (int i=0;i<=nums.length;i++) {
            while (!stack.isEmpty() && (i== nums.length || nums[stack.peek()] > nums[i])) {
                int j = stack.pop();
                res = Math.max(res, nums[j] * (dp[i]-dp[stack.isEmpty()? 0: stack.peek()+1]));
            }
            stack.add(i);
        }
        return (int)(res % 1000000007);
    }


}
