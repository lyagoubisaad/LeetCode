package leetcode_categories.arrays_hashings;

import java.util.Arrays;

public class L_41_FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        Boolean[] seen = new Boolean[nums.length+1];
        Arrays.fill(seen, false);
        for (int i=0;i<nums.length;i++) {
            if(nums[i] <= seen.length && nums[i] > 0) {
                seen[nums[i]] = true;
            }
        }
        for (int i=1;i<seen.length;i++) {
            if(!seen[i]) return i;
        }
        return seen.length;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {1}));
    }
}
