package leetcode_categories.linked_list;

import java.util.HashSet;

public class L_287_FindtheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        for (int i=0;i<nums.length;i++) {
            if(!hm.add(nums[i])) return nums[i];
        }
        return 0;
    }
}
