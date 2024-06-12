package leetcode_categories.greedy;

import java.util.HashSet;

public class L55JumpGame {
    public boolean canJump(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        return dfs(0, nums, set);
    }

    private boolean dfs(int idx, int[] nums, HashSet<Integer> set) {
        if(idx >= nums.length-1) return true;
        if(set.contains(idx)) return false;
        int value = nums[idx];
        for (int i=1;i<=value;i++) {
            if(dfs(idx+i, nums, set)) return true;
        }
        set.add(idx);
        return false;
    }
}
