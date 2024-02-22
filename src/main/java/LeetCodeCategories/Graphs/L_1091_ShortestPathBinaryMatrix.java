package LeetCodeCategories.Graphs;

import java.util.ArrayDeque;
import java.util.Queue;

public class L_1091_ShortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1 || grid[grid.length-1][grid.length-1] == 1) return -1;
        boolean[][] visited = new boolean[grid.length][grid.length];
        int[][] directions = new int[][] {{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[] {0,0});
        return bfs(visited, queue, directions, grid);
    }

    private int bfs(boolean[][] visited, Queue<int[]> queue, int[][] directions, int[][] grid) {
        int length = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0;i<size;i++) {
                int[] curr = queue.poll();
                int row = curr[0];
                int col = curr[1];
                if(isNotValid(row, col, grid) || grid[row][col] == 1 || visited[row][col]) continue;
                if(row == grid.length-1 && col == grid.length-1) return length;
                visited[row][col] = true;
                for (int[] direction: directions) {
                    queue.offer(new int[] {row+direction[0], col+direction[1]});
                }
            }
            length++;
        }
        return -1;
    }

    private boolean isNotValid(int posY, int posX, int[][] grid) {
        return (posY<0 || posY >= grid.length || posX<0 || posX >= grid[0].length);
    }
}
