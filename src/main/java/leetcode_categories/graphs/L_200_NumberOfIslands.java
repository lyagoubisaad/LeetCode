package leetcode_categories.graphs;

public class L_200_NumberOfIslands {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = 0;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if(grid[i][j] == '1') {
                    total++;
                    bfs(grid, i, j);
                }
            }
        }
        return total;
    }
    private void bfs(char[][] grid, int i, int j) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;
        grid[i][j] = '0';
        bfs(grid, i-1, j);
        bfs(grid, i+1, j);
        bfs(grid, i, j-1);
        bfs(grid, i, j+1);
    }
}
