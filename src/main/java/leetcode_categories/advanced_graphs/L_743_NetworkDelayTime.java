package leetcode_categories.advanced_graphs;

import java.util.*;

public class L_743_NetworkDelayTime {
    public int networkDelayTime(int[][] times, int n, int k) {
        Comparator<int[]> distanceComparator = Comparator.comparingInt(arr -> arr[0]);
        HashMap<Integer, Queue<int[]>> adjacencyList = new HashMap<>();
        HashSet<Integer> seenSet = new HashSet<>();
        for (int i=1;i<=n;i++) seenSet.add(i);
        for (int[] time: times) {
            adjacencyList.computeIfAbsent(time[0], val -> new PriorityQueue<>(distanceComparator)).add(new int[] {time[2], time[1]});
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(distanceComparator);
        minHeap.add(new int[] {0, k});
        while (!minHeap.isEmpty() && !seenSet.isEmpty()) {
            int[] element = minHeap.poll();
            int time = element[0];
            int to = element[1];
            seenSet.remove(to);
            if(seenSet.isEmpty()) return time;
            for (int[] node: adjacencyList.getOrDefault(to, new ArrayDeque<>())) {
                if(!seenSet.contains(node[1])) continue;
                minHeap.add(new int[] {time+node[0], node[1]});
            }
        }
        return -1;
    }
}
