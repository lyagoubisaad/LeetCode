package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.List;

public class L_77_Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> allLists = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        backtrack(allLists, currentList, 1, n, k);
        return allLists;
    }
    private static void backtrack(List<List<Integer>> allLists, List<Integer> currentList, int start, int n, int k) {
        if (k == 0) {
            allLists.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = start; i <= n; i++) {
            currentList.add(i);
            backtrack(allLists, currentList, i + 1, n, k - 1);
            currentList.remove(currentList.size() - 1);
        }
    }
}
