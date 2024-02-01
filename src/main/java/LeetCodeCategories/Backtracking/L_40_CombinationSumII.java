package LeetCodeCategories.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L_40_CombinationSumII {
    List<Integer> subset = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(0, candidates, 0 , target);
        return res;
    }

    private void dfs(int start, int[] candidates, int sum, int target) {
        if(sum == target) {
            res.add(new ArrayList<>(subset));
            return;
        }
        if(sum > target) return;
        for (int i=start;i<candidates.length;i++) {
            if (i > start && candidates[i] == candidates[i - 1]) return;
            subset.add(candidates[i]);
            dfs(i+1, candidates, sum+candidates[i], target);
            subset.remove(subset.size()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new L_40_CombinationSumII().combinationSum2(new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 27));
    }
}
