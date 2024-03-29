package leetcode_categories.intervals;

import java.util.*;

public class L_1851_MinimumIntervaltoIncludeEachQuery {
    public static int[] minInterval(int[][] intervals, int[] queries) {
        int[] res = new int[queries.length];
        System.arraycopy(queries, 0, res, 0, queries.length);
        Arrays.sort(queries);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int query : queries) {
            set.add(query);
        }
        Arrays.sort(intervals, (a,b) -> a[0] == b[0]? Integer.compare(a[1], b[1]): Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (a[1] - a[0])));
        int intervalsIdx = 0;
        HashMap<Integer, Integer> store = new HashMap<>();
        for (int elem : set) {
            while (!minHeap.isEmpty() && minHeap.peek()[1] < elem) {
                minHeap.remove();
            }
            while (intervalsIdx < intervals.length && intervals[intervalsIdx][0] <= elem) {
                if (intervals[intervalsIdx][1] >= elem) minHeap.add(intervals[intervalsIdx]);
                intervalsIdx++;
            }
            int min = minHeap.isEmpty() ? -1 : (minHeap.peek()[1] - minHeap.peek()[0] + 1);
            store.put(elem, min);
        }
        for (int i=0;i<res.length;i++) {
            res[i] = store.get(res[i]);
        }
        return res;
    }
}
