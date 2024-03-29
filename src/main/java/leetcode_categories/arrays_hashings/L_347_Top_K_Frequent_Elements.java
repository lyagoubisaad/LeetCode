package leetcode_categories.arrays_hashings;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class L_347_Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            store.put(nums[i], store.getOrDefault(nums[i], 0) + 1);
        }

        store = store
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(
                        Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2,
                                LinkedHashMap::new));

        int[] res = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            res[i] = entry.getKey();
            i++;
            if(i == k) break;
        }

        return res;
    }

    public static void main(String[] args) {
        new L_347_Top_K_Frequent_Elements().topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
    }
}
