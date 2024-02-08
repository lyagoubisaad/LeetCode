package LeetCodeCategories.Graphs;

public class L_1905_CountSubIslands {
    int cpt;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        cpt = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[i].length; j++) {
                if (grid2[i][j] == 1 && dfs(grid1, grid2, i, j)) cpt++;
            }
        }
        return cpt;
    }

    private boolean dfs(int[][] grid1, int[][] grid2, int row, int col) {
        if (row < 0 || col < 0 || row == grid1.length || col == grid1[0].length) return true;
        if (grid2[row][col] == 0) return true;
        if (grid1[row][col] == 0) return false;
        grid2[row][col] = 0;
        boolean up = dfs(grid1, grid2, row + 1, col);
        boolean down = dfs(grid1, grid2, row - 1, col);
        boolean left = dfs(grid1, grid2, row, col - 1);
        boolean right = dfs(grid1, grid2, row, col + 1);
        return up && down && left && right;
    }
}
