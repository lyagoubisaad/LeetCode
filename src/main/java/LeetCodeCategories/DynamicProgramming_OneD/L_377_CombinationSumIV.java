package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;

public class L_377_CombinationSumIV {

    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target+1];
        Arrays.fill(memo, -1);
        return dp(nums, target, memo);
    }

    public int dp(int[] nums, int target, int[] memo) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (memo[target] != -1) return memo[target];
        int count = 0;
        for (int num : nums) count += dp(nums, target - num, memo);
        memo[target] = count;
        return count;
    }
}
