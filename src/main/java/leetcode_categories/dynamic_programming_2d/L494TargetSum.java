package leetcode_categories.dynamic_programming_2d;

import java.util.HashMap;

public class L494TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> cache = new HashMap<>();
        return helper(target, 0, nums, 0, cache);
    }

    int helper(int target, int sum ,int[] nums, int index, HashMap<String, Integer> cache) {
        if(index == nums.length) {
            if(target == sum) return 1;
            else return 0;
        }
        String key = sum + "+" + index;
        if(cache.containsKey(key)) return cache.get(key);
        int count = helper(target, sum-nums[index], nums, index+1, cache) + helper(target, sum+nums[index], nums, index+1, cache);
        cache.put(key, count);
        return count;
    }

    public static void main(String[] args) {
        int result = new L494TargetSum().findTargetSumWays(new int[] {1,1,1,1,1}, 3);
        System.out.println(result);
    }
}
