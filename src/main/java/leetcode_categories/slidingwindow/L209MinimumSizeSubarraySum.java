package leetcode_categories.slidingwindow;

public class L209MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        long sum = 0;
        int len = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                len = Math.min(len, right-left+1);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        if(len == Integer.MAX_VALUE) return 0;
        return len;
    }
}
