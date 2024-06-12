package leetcode_categories.dynamic_programming_1d;

import java.util.HashMap;

public class L198HouseRobber {
    public int rob(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return dfs(0, nums, map);
    }

    private int dfs(int i, int[] nums, HashMap<Integer, Integer> map) {
        if(i >= nums.length) return 0;
        if (!map.containsKey(i)) {
            map.put(i, Math.max(nums[i]+dfs(i+2, nums, map), dfs(i+1, nums, map)));
        }
        return map.get(i);
    }
}
