package leetcode_categories.graphs;

public class L_994_RottingOranges {
    public int orangesRotting(int[][] grid) {
        int maxDist = -1;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if(grid[i][j] == 2) {
                    bfs(grid, i, j, grid[i][j]);
                }
            }
        }
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                maxDist = Math.max(maxDist, grid[i][j]);
                if(grid[i][j] == 1) return -1;
            }
        }
        if(maxDist == 0) return 0;
        return maxDist;
    }

    private void bfs(int[][] grid, int i, int j, int value) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        if(grid[i][j] > 2) return;
        if(grid[i][j] == 1) {
            grid[i][j] = 1+value;
        }

        bfs(grid, i-1,j, grid[i][j]);
        bfs(grid, i+1,j, grid[i][j]);
        bfs(grid, i,j-1, grid[i][j]);
        bfs(grid, i,j+1, grid[i][j]);
    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{2,1,1},{1,1,0},{0,1,1}};
        new L_994_RottingOranges().orangesRotting(grid);
    }
}
