package leetcode_categories.arrays_hashings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int num : nums) {
            store.put(num, store.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(Comparator.comparingInt(a -> -a[1]));
        for (Map.Entry<Integer, Integer> entry: store.entrySet()) {
            maxHeap.add(new int[] {entry.getKey(), entry.getValue()});
        }
        int[] topFrequentArray = new int[k];
        while (k>0) {
            topFrequentArray[k-1] = maxHeap.poll()[0];
            k--;
        }
        return topFrequentArray;
    }
}
