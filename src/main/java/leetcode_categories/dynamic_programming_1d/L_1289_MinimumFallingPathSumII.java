package leetcode_categories.dynamic_programming_1d;

public class L_1289_MinimumFallingPathSumII {

    int[][] memo;
    public int minFallingPathSum(int[][] grid) {
        memo = new int[grid[0].length][grid[0].length];
        int min = 100;
        for (int i=0;i<grid[0].length;i++) {
            min = Math.min(grid[0][i] + dfs(i, 1, grid), min);
        }
        return min;
    }

    private int dfs(int prv, int row, int[][] grid) {
        if (row == grid.length) return 0;
        if(memo[prv][row] == 0) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < grid[row].length; j++) {
                if (j != prv) {
                    min = Math.min(min, grid[row][j] + dfs(j, row + 1, grid));
                }
            }
            memo[prv][row] = min;
        }
        return memo[prv][row];
    }
}
