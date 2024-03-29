package leetcode_categories.arrays_hashings;

public class L_1480_RunningSumof1dArray {
    public static int[] runningSum(int[] nums) {
        if(nums.length == 1) return nums;
        for (int i=1;i<nums.length;i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        runningSum(new int[] {1,2,3,4});
    }
}
