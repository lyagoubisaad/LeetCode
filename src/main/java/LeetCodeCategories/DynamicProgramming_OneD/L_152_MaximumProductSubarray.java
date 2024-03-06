package LeetCodeCategories.DynamicProgramming_OneD;

public class L_152_MaximumProductSubarray {
    int[] mins;
    int[] maxs;
    public int maxProduct(int[] nums) {
        mins = new int[nums.length];
        mins[0] = nums[0];
        maxs = new int[nums.length];
        maxs[0] = nums[0];
        int max = maxs[0];
        for (int i=1;i<nums.length;i++) {
            mins[i] = Math.min(nums[i],Math.min(nums[i]*mins[i-1], nums[i]*maxs[i-1]));
            maxs[i] = Math.max(nums[i],Math.max(nums[i]*maxs[i-1], nums[i]*maxs[i-1]));
            max = Math.max(max, maxs[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        new L_152_MaximumProductSubarray().maxProduct(new int[] {2,3,-2,4});
    }
}
