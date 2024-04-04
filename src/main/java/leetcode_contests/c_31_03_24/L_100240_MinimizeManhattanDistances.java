package leetcode_contests.c_31_03_24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class L_100240_MinimizeManhattanDistances {
    public int minimumDistance(int[][] points) {
        HashMap<Integer, PriorityQueue<int[]>> adjacencyQueues = new HashMap<>();
        Comparator<int[]> distanceComparator = Comparator.comparingInt(arr -> arr[0]);
        for (int i=0;i<points.length;i++) {
            for (int j=i+1;j<points.length;j++) {
                int distance = getManhattanDistance(points[i], points[j]);
                adjacencyQueues.computeIfAbsent(i, val -> new PriorityQueue<>(distanceComparator.reversed())).add(new int[] {distance, j});
                adjacencyQueues.computeIfAbsent(j, val -> new PriorityQueue<>(distanceComparator.reversed())).add(new int[] {distance, i});
            }
        }
        int[] without = new int[points.length];
        Arrays.fill(without, Integer.MIN_VALUE);
        for (int i=0;i<points.length;i++) {
            PriorityQueue<int[]> adjacencyQueue = adjacencyQueues.get(i);
            adjacencyQueue.poll();
            int[] element = adjacencyQueue.poll();
            for (int j=0;j<without.length;j++) {
                if(j==element[1]) continue;
                without[j] = Math.max(without[j], element[0]);
            }
            int maxDistanceWithoutPointI = 0;
            int[] peekedElement = adjacencyQueue.peek();
            if (peekedElement != null) {
                maxDistanceWithoutPointI = peekedElement[0];
            }
            without[element[1]] = Math.max(maxDistanceWithoutPointI, without[element[1]]);
        }
        int maxDistance = Integer.MAX_VALUE;
        for (int i=0;i<without.length;i++) {
            maxDistance = Math.min(without[i], maxDistance);
        }
        return maxDistance;
    }
    private int getManhattanDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }
}
