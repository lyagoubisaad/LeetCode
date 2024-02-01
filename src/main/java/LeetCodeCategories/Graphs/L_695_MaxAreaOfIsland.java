package LeetCodeCategories.Graphs;

public class L_695_MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxArea = 0;
        for (int i=0;i<rows;i++) {
            for (int j=0;j<cols;j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(bfs(grid, i, j), maxArea);
                }
            }
        }
        return maxArea;
    }
    private int bfs(int[][] grid, int i, int j) {
        if(i<0 || i >= grid.length || j<0 || j>= grid[0].length || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return 1 + bfs(grid, i-1,j)
                + bfs(grid, i+1,j)
                + bfs(grid, i,j-1)
                + bfs(grid, i,j+1);
    }
}
