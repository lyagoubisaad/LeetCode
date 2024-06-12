package leetcode_categories.dynamic_programming_1d;

import java.util.HashMap;

public class L213HouseRobberII {

    HashMap<Integer, Integer> map;
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        map = new HashMap<>();
        int first = dfs(1, nums.length, nums);
        map.clear();
        int second = dfs(0, nums.length-1, nums);
        return Math.max(first, second);
    }

    private int dfs(int start, int end, int[] nums) {
        if(start >= end) return 0;
        if(!map.containsKey(start)) {
            map.put(start, Math.max(dfs(start+1, end, nums), dfs(start+2, end, nums)+ nums[start]));
        }
        return map.get(start);
    }
}
