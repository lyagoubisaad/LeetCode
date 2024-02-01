package LeetCodeCategories.Greedy;

public class L_918_Maximum_Sum_Circular_Subarray {
    public static int maxSubarraySumCircular(int[] nums) {
        int currSumMin = nums[0];
        int currSumMax = nums[0];
        int min = nums[0];
        int max = nums[0];
        int totalSum = nums[0];
         for (int i=1;i<nums.length;i++) {
            currSumMin = Math.min(nums[i], currSumMin+nums[i]);
            currSumMax = Math.max(nums[i], currSumMax+nums[i]);
            max = Math.max(max, currSumMax);
            min = Math.min(min, currSumMin);
            totalSum += nums[i];
        }
         if(totalSum == min) return max;
         return Math.max(totalSum - min, max);
    }
}
