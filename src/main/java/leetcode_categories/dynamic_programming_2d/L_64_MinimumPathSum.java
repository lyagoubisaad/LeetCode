package leetcode_categories.dynamic_programming_2d;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L_64_MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int[][] directions = new int[][] {{1,0}, {0,1}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.add(new int[] {grid[0][0], 0, 0});
        while (!minHeap.isEmpty()) {
            int[] element = minHeap.poll();
            int value = element[0];
            int posY = element[1];
            int posX = element[2];
            if(posY == grid.length-1 && posX == grid[0].length-1) return value;
            visited[posY][posX] = true;
            for (int[] direction: directions) {
                int nextY = posY+direction[0];
                int nextX = posX+direction[1];
                if(isValid(nextY, nextX, grid) && !visited[nextY][nextX]) {
                    int nextValue = value+grid[nextY][nextX];
                    minHeap.add(new int[] {nextValue, nextY, nextX});
                }
            }
        }
        return 0;
    }

    private boolean isValid(int nextY, int nextX, int[][] grid) {
        return nextY >= 0 && nextY < grid.length && nextX >= 0 && nextX < grid[0].length;
    }
}
