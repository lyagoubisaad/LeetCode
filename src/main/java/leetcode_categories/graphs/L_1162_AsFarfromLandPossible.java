package leetcode_categories.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1162_AsFarfromLandPossible {
    public int maxDistance(int[][] grid) {
        Queue<int[]> waterCells = new ArrayDeque<>();
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 1) waterCells.add(new int[] {i,j});
            }
        }
        int size = waterCells.size();
        if(size == 0 || size == grid.length*grid.length) return -1;
        int[][] directions = new int[][] {{-1,0}, {1,0}, {0,-1}, {0, 1}};
        return bfs(waterCells, grid, directions);
    }

    private int bfs(Queue<int[]> queue, int[][] grid, int[][] directions) {
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                int[] curr = queue.poll();
                for (int[] direction: directions) {
                    if(isNotValid(curr[0]+ direction[0], curr[1]+direction[1], grid) || grid[curr[0]+direction[0]][curr[1]+direction[1]] == 1) continue;
                    grid[curr[0]+direction[0]][curr[1]+direction[1]] = 1;
                    queue.offer(new int[] {curr[0]+ direction[0], curr[1]+ direction[1]});
                }
            }
            length++;
        }
        return length-1;
    }

    private boolean isNotValid(int posY, int posX, int[][] grid) {
        return posX < 0 || posY < 0 || posY >= grid.length || posX >= grid.length;
    }
}
