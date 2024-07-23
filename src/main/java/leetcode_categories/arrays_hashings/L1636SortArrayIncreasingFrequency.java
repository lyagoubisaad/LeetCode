package leetcode_categories.arrays_hashings;

import java.util.*;

public class L1636SortArrayIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Comparator<int[]> comparator = (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(b[0], a[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        };
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(comparator);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            priorityQueue.offer(new int[] {entry.getKey(), entry.getValue()});
        }
        int[] frequencySort = new int[nums.length];
        int val;
        int freq;
        int i = 0;
        while (!priorityQueue.isEmpty()) {
            val = priorityQueue.peek()[0];
            freq = priorityQueue.peek()[1];
            for (int j=i;i<freq+j;i++) {
                frequencySort[i] = val;
            }
            priorityQueue.poll();
        }
        return frequencySort;
    }
}
