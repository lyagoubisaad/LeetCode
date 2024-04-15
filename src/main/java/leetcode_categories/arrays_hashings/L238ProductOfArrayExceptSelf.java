package leetcode_categories.arrays_hashings;

public class L238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int cptZero = 0;
        int length = nums.length;
        int product = 1;
        for (int num: nums) {
            if(num == 0) cptZero++;
            else product *= num;
            if(cptZero == 2) {
                for (int i=0;i<length;i++) {
                    nums[i] = 0;
                }
                return nums;
            }

        }
        for (int i=0;i<nums.length;i++) {
            if(nums[i] == 0) nums[i] = product;
            else nums[i] = cptZero == 1? 0:product/nums[i];
        }
        return nums;
    }
}
