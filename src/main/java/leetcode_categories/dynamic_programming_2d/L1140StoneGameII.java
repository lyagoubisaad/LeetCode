package leetcode_categories.dynamic_programming_2d;

public class L1140StoneGameII {
    public int stoneGameII(int[] piles) {
        int totalPiles = 0;
        for (int pile : piles) {
            totalPiles += pile;
        }
        int[][] dp = new int[piles.length][piles.length+1];
        dfs(0, piles, 1, dp, 0);
        return (totalPiles + dp[0][1])/2;
    }

    private int dfs(int i, int[] piles, int M, int[][] dp, int player) {
        if(i == piles.length) return 0;
        if(dp[i][M] != 0) return dp[i][M];
        int totalPts = Integer.MIN_VALUE;
        int sum = 0;
        for (int j=0;j<Math.min(2*M, piles.length-i);j++) {
            sum += piles[j+i];
            totalPts = Math.max(totalPts, sum - dfs(i+j+1, piles, Math.max(j+1, M), dp, 1-player));
        }
        return dp[i][M] = totalPts;
    }
}
