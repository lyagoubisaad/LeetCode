package leetcode_categories.dynamic_programming_2d;

import java.util.Arrays;

public class L_877_StoneGame {
    public boolean stoneGame(int[] piles) {
        int[][] memos = new int[piles.length][piles.length];
        for (int[] memo: memos) {
            Arrays.fill(memo, Integer.MAX_VALUE);
        }
        return dfs(0, piles.length-1, piles, memos) > 0;
    }

    private int dfs(int i, int j, int[] piles, int[][] memo) {
        if(memo[i][j] != Integer.MAX_VALUE) return memo[i][j];
        if(i==j) return 0;
        return memo[i][j] = Math.max(piles[i]-dfs(i+1, j, piles, memo),piles[j]-dfs(i,j-1,piles, memo));
    }
}
