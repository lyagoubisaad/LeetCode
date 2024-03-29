package leetcode_categories.dynamic_programming_1d;

public class L_213_HouseRobberII {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n<2) return nums[0];
        return Math.max(helper(0, n-1, nums), helper(1, n, nums));
    }

    private int helper(int start, int end, int[] nums) {
        int prev1=0;
        int prev2=0;
        for (int i=start;i<end; i++) {
            int tmp= prev1;
            prev1 = Math.max(prev2+nums[i], prev1);
            prev2 = tmp;
        }
        return prev1;
    }
}
