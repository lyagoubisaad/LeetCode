package leetcode_categories.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_934_ShortestBridge {
    public int shortestBridge(int[][] grid)  {
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        Queue<int[]> queue = new ArrayDeque<>();
        for (int i=0;i<grid.length;i++) {
            for (int j=0;j<grid[i].length;j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, visited, i, j, directions, queue);
                    return bfs(grid, queue, visited, directions);
                }
            }
        }
        return -1;
    }

    private int bfs(int[][] grid, Queue<int[]> queue, boolean[][] visited, int[][] directions) {
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                int[] curr = queue.poll();
                for (int[] direction: directions) {
                    int row = curr[0] + direction[0];
                    int col = curr[1] + direction[1];
                    if(isNotValid(row, col, grid) || visited[row][col]) continue;
                    if(grid[row][col] == 1) return length;
                    queue.offer(new int[] {row, col});
                    visited[row][col] = true;
                }
            }
            length++;
        }
        return length;
    }

    private void dfs(int[][] grid, boolean[][] visited, int posY, int posX, int[][] directions, Queue<int[]> queue) {
        if(isNotValid(posY, posX, grid) || grid[posY][posX] == 0 || visited[posY][posX]) return;
        visited[posY][posX] = true;
        queue.add(new int[] {posY, posX});
        for (int[] direction: directions) {
            dfs(grid, visited, posY+direction[0], posX+direction[1], directions, queue);
        }
    }

    private boolean isNotValid(int posY, int posX, int[][] grid) {
        return (posY<0 || posY >= grid.length || posX<0 || posX >= grid[0].length);
    }
}
