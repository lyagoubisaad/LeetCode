package leetcode_categories.dynamic_programming_2d;

public class L_329_LongestIncreasingPathMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] directions = new int[][] {{1,0}, {-1,0}, {0,1}, {0,-1}};
        int longestIncreasingPath = 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                longestIncreasingPath = Math.max(longestIncreasingPath, dfs(i, j ,matrix, directions, dp));
            }
        }
        return longestIncreasingPath;
    }
    private int dfs(int posY, int posX, int[][] matrix, int[][] directions, int[][] dp) {
        if(dp[posY][posX] != 0) return dp[posY][posX];
        int longestIncreasingPath = 1;
        for (int[] direction: directions) {
            int nextY = posY+direction[0];
            int nextX = posX+direction[1];
            if(isValid(nextY, nextX, matrix)) {
                if(matrix[posY][posX] > matrix[nextY][nextX]) {
                    longestIncreasingPath = Math.max(longestIncreasingPath,1+dfs(nextY, nextX, matrix, directions, dp));
                }
            }
        }
        return dp[posY][posX] = longestIncreasingPath;
    }
    private boolean isValid(int posY, int posX, int[][] matrix) {
        return posY >= 0 && posY < matrix.length && posX >= 0 && posX < matrix[0].length;
    }
}
