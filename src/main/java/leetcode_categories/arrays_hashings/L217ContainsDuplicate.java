package leetcode_categories.arrays_hashings;

import java.util.Arrays;
import java.util.HashSet;

public class L217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (int num: nums) {
            if(!uniqueValues.add(num)) return true;
        }
        return false;
    }
    public boolean containsDuplicateV2(int[] nums) {
        Arrays.sort(nums);
        for (int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1]) return true;
        }
        return false;
    }
}
