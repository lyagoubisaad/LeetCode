package leetcode_categories.arrays_hashings;

import java.util.HashMap;

public class L_523_ContinuousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<>();
        store.put(0, -1);
        int total = 0;
        for (int i=0;i<nums.length;i++) {
            total += nums[i];
            int remainder = total%k;
            if(!store.containsKey(remainder)) store.put(remainder, i);
            else if (i - store.get(remainder) > 1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        checkSubarraySum(new int[] {2,4,3},6);
    }

}