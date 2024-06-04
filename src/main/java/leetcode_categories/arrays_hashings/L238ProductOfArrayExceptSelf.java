package leetcode_categories.arrays_hashings;

public class L238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] copy = new int[nums.length];
        int mult = 1;
        int cpt = 0;
        for (int num : nums) {
            if (num == 0) {
                cpt++;
                continue;
            }
            mult *= num;
        }
        if(cpt == 2) return copy;
        if(cpt == 1) {
            for (int i=0;i<nums.length;i++) {
                if(nums[i] == 0) copy[i] = mult;
                else copy[i] = 0;
            }
            return copy;
        }
        for (int i=0;i<nums.length;i++) {
            copy[i] = mult/nums[i];
        }
        return copy;
    }
}
