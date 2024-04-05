package leetcode_categories.dynamic_programming_2d;

public class L63UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[obstacleGrid.length-1][obstacleGrid[0].length-1] = 1-obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
        for (int i=obstacleGrid.length-2;i>=0;i--) {
            dp[i][obstacleGrid[0].length-1] = Math.min(dp[i+1][obstacleGrid[0].length-1], 1-obstacleGrid[i][obstacleGrid[0].length-1]);
        }
        for (int i=obstacleGrid[0].length-2;i>=0;i--) {
            dp[obstacleGrid.length-1][i] = Math.min(dp[obstacleGrid.length-1][i+1], 1-obstacleGrid[obstacleGrid.length-1][i]);
        }
        int[][] directions = new int[][] {{0,1}, {1,0}};
        return dfs(0,0,obstacleGrid, dp, directions);
    }

    private int dfs(int posY, int posX, int[][] obstacleGrid, int[][] dp, int[][] directions) {
        if(obstacleGrid[posY][posX] == 1) return 0;
        if(dp[posY][posX] != 0) return dp[posY][posX];
        int count = 0;
        for (int[] direction: directions) {
            if(!isvalid(posY+direction[0], posX+direction[1], obstacleGrid)) continue;
            count += dfs(posY+direction[0], posX+direction[1], obstacleGrid, dp, directions);
        }
        return dp[posY][posX] = count;
    }

    private boolean isvalid(int posY, int posX, int[][] obstacleGrid) {
        return posY>=0 && posY< obstacleGrid.length && posX >=0 && posX<obstacleGrid[0].length;
    }
}
