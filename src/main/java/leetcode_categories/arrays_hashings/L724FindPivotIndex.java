package leetcode_categories.arrays_hashings;

public class L724FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        for (int num: nums) {
            sum += num;
        }
        int idx = 0;
        int rightSum;
        while (idx < nums.length) {
            leftSum += idx == 0 ? 0 : nums[idx-1];
            rightSum = sum - leftSum - nums[idx];
            if(leftSum == rightSum) return idx;
            idx ++;
        }
        return -1;
    }
}