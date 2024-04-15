package leetcode_categories.graphs_advanced;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L_778_SwimRisingWater {
    public int swimInWater(int[][] grid) {
        int[][] directions = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        boolean[][] seen = new boolean[grid.length][grid[0].length];
        minHeap.add(new int[] {grid[0][0],0,0});
        while (!minHeap.isEmpty()) {
            int[] squarePair = minHeap.poll();
            int value = squarePair[0];
            int posY = squarePair[1];
            int posX = squarePair[2];
            if(posY == grid.length-1 && posX == grid[0].length-1) return value;
            seen[posY][posX] = true;
            for (int[] direction : directions) {
                int nextY = posY + direction[0];
                int nextX = posX + direction[1];
                if (isValid(nextY, nextX, grid) && !seen[nextY][nextX]) {
                    minHeap.add(new int[]{Math.max(grid[nextY][nextX], value), nextY, nextX});
                }
            }
        }
        return 0;
    }
    private boolean isValid(int nextY, int nextX, int[][] grid) {
        return nextY>=0 && nextY < grid.length && nextX>=0 && nextX < grid[0].length;
    }
}
