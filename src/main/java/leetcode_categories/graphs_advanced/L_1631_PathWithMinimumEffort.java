package leetcode_categories.graphs_advanced;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L_1631_PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
        int[][] directions = new int[][] {{0,-1}, {0,1}, {1,0}, {-1,0}};
        int[][] distance = new int[heights.length][heights[0].length];
        boolean[][] seen = new boolean[heights.length][heights[0].length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[] {0,0,0});
        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            seen[element[1]][element[2]] = true;
            distance[element[1]][element[2]] = element[0];
            if(element[1] == heights.length-1 && element[2] == heights[0].length-1) break;
            for (int[] direction : directions) {
                int nextY = element[1] + direction[0];
                int nextX = element[2] + direction[1];
                if (isValid(nextY, nextX, heights) && !seen[nextY][nextX]) {
                    int newVal = Math.max(element[0], Math.abs(heights[nextY][nextX]-heights[element[1]][element[2]]));
                    minHeap.add(new int[]{newVal, nextY, nextX});
                }
            }
        }
        return distance[heights.length-1][heights[0].length-1];
    }

    private boolean isValid(int y, int x, int[][] heights) {
        return x < heights[0].length && x >= 0 && y < heights.length && y >= 0;
    }
}
