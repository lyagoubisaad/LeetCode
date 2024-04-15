package leetcode_categories.graphs_advanced;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class L_1584_Min_CostConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        if(points.length == 1) return 0;
        HashMap<Integer, PriorityQueue<int[]>> adjacencyList = new HashMap<>();
        Comparator<int[]> distanceComparator = Comparator.comparingInt(arr -> arr[0]);
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<points.length;i++) {
            set.add(i);
            for (int j=i+1;j<points.length;j++) {
                int distance = getManhattanDistance(points[i], points[j]);
                adjacencyList.computeIfAbsent(i, val -> new PriorityQueue<>(distanceComparator)).add(new int[] {distance, j});
                adjacencyList.computeIfAbsent(j, val -> new PriorityQueue<>(distanceComparator)).add(new int[] {distance, i});
            }
        }
        PriorityQueue<int[]> queues = new PriorityQueue<>(distanceComparator);
        queues.addAll(adjacencyList.get(0));
        set.remove(0);
        return bfs(adjacencyList, set, queues);
    }

    private int bfs(HashMap<Integer, PriorityQueue<int[]>> adjacencyList, HashSet<Integer> set, PriorityQueue<int[]> queues) {
        int minCost = 0;
        while (!set.isEmpty()) {
            PriorityQueue<int[]> queuesCopy = new PriorityQueue<>(queues);
            int[] elements = queuesCopy.poll();
            while (!set.contains(elements[1])) elements = queuesCopy.poll();
            set.remove(elements[1]);
            minCost += elements[0];
            queues.addAll(adjacencyList.get(elements[1]));
        }
        return minCost;
    }

    private int getManhattanDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0]-point2[0])+Math.abs(point1[1]-point2[1]);
    }
}
