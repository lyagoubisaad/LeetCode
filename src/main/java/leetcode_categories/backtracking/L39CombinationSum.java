package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L39CombinationSum {

    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0, candidates, target, new ArrayList<>());
        return result;
    }

    private void dfs(int idx, int[] candidates, int target, List<Integer> localList) {
        if(target < 0 || idx >= candidates.length) return;
        if(target == 0) {
            result.add(new ArrayList<>(localList));
            return;
        }
        localList.add(candidates[idx]);
        dfs(idx, candidates,target-candidates[idx], localList);
        localList.remove(localList.size()-1);
        dfs(idx+1, candidates, target, localList);
    }
}
