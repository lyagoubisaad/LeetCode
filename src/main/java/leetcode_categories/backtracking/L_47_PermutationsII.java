package leetcode_categories.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L_47_PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> numOccur = new HashMap<>();
        for (int num: nums) {
            numOccur.put(num, numOccur.getOrDefault(num, 0)+1);

        }
        List<List<Integer>> allLists = new ArrayList<>();
        List<Integer> currentList = new ArrayList<>();
        dfs(allLists, currentList, numOccur);
        return allLists;
    }

    private static void dfs(List<List<Integer>> allLists, List<Integer> currentList, HashMap<Integer, Integer> store) {
        if (store.isEmpty()) {
            allLists.add(new ArrayList<>(currentList));
            return;
        }

        // Create a copy of the original store
        HashMap<Integer, Integer> storeCopy = new HashMap<>(store);

        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            int element = entry.getKey();
            currentList.add(element);

            // Modify the copy of the store
            storeCopy.put(element, entry.getValue() - 1);
            if (entry.getValue() == 1) {
                storeCopy.remove(element);
            }

            // Recursive call with the modified store copy
            dfs(allLists, currentList, storeCopy);

            // Backtrack: remove the last element and restore the original store for the next iteration
            currentList.remove(currentList.size() - 1);
            storeCopy.put(element, entry.getValue());
        }
    }
}
