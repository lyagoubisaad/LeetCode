package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int value;
        for (int i=0;i<nums.length;i++) {
            value = target-nums[i];
            if(map.containsKey(value)) return new int[] {map.get(value), i};
            map.put(nums[i], i);
        }
        return nums;
    }
}
