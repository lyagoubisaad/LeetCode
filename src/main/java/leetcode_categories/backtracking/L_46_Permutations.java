package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_46_Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> allLists = new ArrayList<>();
        backtrack(allLists, new ArrayList<>(), nums);
        return allLists;
    }
    private static void backtrack(List<List<Integer>> allLists, List<Integer> currentList, int[] nums) {
        if(currentList.size() == nums.length) {
            allLists.add(new ArrayList<>(currentList));
            return;
        }
        for (int num : nums) {
            if (!currentList.contains(num)) {
                currentList.add(num);
                backtrack(allLists, currentList, nums);
                currentList.remove(currentList.size()-1);
            }
        }
    }
}
