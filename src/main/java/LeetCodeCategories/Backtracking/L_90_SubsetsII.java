package LeetCodeCategories.Backtracking;

import java.util.*;

public class L_90_SubsetsII {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        dfs(0, nums);
        return res;
    }

    private void dfs(int start ,int[] nums) {
        if(start >= nums.length) {
            List<Integer> sortedSubset = new ArrayList<>(subset);
            Collections.sort(sortedSubset);
            if(!res.contains(sortedSubset)) res.add(new ArrayList<>(sortedSubset));
            return;
        }
        for (int i=start;i<nums.length;i++) {
            if(i > start && nums[i] == nums[i+1]) continue;
            subset.add(nums[i]);
            dfs(i+1, nums);
            subset.remove(subset.size()-1);
            dfs(i+1, nums);
        }
    }
}