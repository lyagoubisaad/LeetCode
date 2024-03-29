package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_39_CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, target, 0);
        return res;
    }

    private void dfs(int start, int[] candidates, int target, int sum) {
        if(sum == target) {
            res.add(new ArrayList<>(subset));
            return;
        }
        for (int i=start;i<candidates.length;i++) {
            if(sum + candidates[i] > target) return;
            subset.add(candidates[i]);
            dfs(i, candidates, target, sum+candidates[i]);
            subset.remove(subset.size()-1);
        }
    }
}
