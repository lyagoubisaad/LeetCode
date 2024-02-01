package LeetCodeCategories.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_78_Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> currentList = new ArrayList<>();
        List<List<Integer>> allLists = new ArrayList<>();
        dfs(0, nums, currentList, allLists);
        return allLists;
    }

    private static void dfs(int start, int[] nums, List<Integer> currentList, List<List<Integer>> allLists) {
        if(start == nums.length) {
            allLists.add(new ArrayList<>(currentList));
            return;
        }
        currentList.add(nums[start]);
        dfs(start+1, nums, currentList, allLists);
        currentList.remove(currentList.size()-1);
        dfs(start+1, nums, currentList, allLists);
    }
}
