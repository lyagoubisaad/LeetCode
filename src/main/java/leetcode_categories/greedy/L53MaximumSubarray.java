package leetcode_categories.greedy;

public class L53MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSubArray = sum;
        for (int i=1;i<nums.length;i++) {
            if(sum < 0) {
                sum = nums[i];
            } else sum += nums[i];
            maxSubArray = Math.max(maxSubArray, sum);
        }
        return maxSubArray;
    }
}
