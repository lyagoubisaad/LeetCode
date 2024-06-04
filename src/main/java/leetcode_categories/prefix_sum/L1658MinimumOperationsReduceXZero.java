package leetcode_categories.prefix_sum;

import java.util.HashMap;
import java.util.HashSet;

public class L1658MinimumOperationsReduceXZero {

    int minOperations = Integer.MAX_VALUE;
    boolean[] dp;
    public int minOperations(int[] nums, int x) {
        dp = new boolean[x+1];
        dfs(0, nums.length-1, nums, x, 0);
        if(minOperations == Integer.MAX_VALUE) return -1;
        return minOperations;
    }

    private void dfs(int left, int right, int[] nums, int x, int minOperations) {
        if(x == 0) {
            this.minOperations = Math.min(this.minOperations, minOperations);
            return;
        }
        if(x < 0) return;
        if(left > right) return;
        if(minOperations >= this.minOperations) return;
        if(!dp[x]) {
            if(nums[left] > nums[right]) {
                dfs(left+1, right, nums, x - nums[left], 1+minOperations);
                dfs(left, right-1, nums, x - nums[right], 1+minOperations);
            } else {
                dfs(left, right-1, nums, x - nums[right], 1+minOperations);
                dfs(left+1, right, nums, x - nums[left], 1+minOperations);
            }
        }
        dp[x] = true;
    }
}
