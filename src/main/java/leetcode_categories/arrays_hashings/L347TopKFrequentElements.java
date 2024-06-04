package leetcode_categories.arrays_hashings;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class L347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        Comparator<int[]> comparator = Comparator.comparingInt(arr -> -arr[1]);
        PriorityQueue<int[]> queue = new PriorityQueue<>(comparator);
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            queue.add(new int[] {entry.getKey(), entry.getValue()});
        }
        int[] result = new int[k];
        for (int i=0;i<k;i++) {
            result[i] = queue.poll()[0];
        }
        return result;
    }
}
