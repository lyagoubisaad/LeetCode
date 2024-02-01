package LeetCodeCategories.ArrayAndHashings;

import java.util.HashSet;

public class L_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length < 2) return false;
        HashSet<Integer> hashSet = new HashSet<Integer>(nums.length);
        for (int num: nums) {
            if(!hashSet.add(num)) return true;
        }
        return false;
    }
}
