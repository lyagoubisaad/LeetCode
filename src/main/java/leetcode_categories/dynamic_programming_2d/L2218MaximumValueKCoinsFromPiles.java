package leetcode_categories.dynamic_programming_2d;

import java.util.List;

public class L2218MaximumValueKCoinsFromPiles {
    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int[][] dp = new int[piles.size()][k+1];
        return dfs(0, piles, k, dp);
    }

    private int dfs(int i, List<List<Integer>> piles, int k, int[][] dp) {
        if(i == piles.size() || k == 0) return 0;
        if(dp[i][k] != 0) return dp[i][k];
        int res = dfs(i+1, piles, k, dp);
        int sum = 0;
        for (int j=0;j<Math.min(piles.get(i).size(), k );j++) {
            sum += piles.get(i).get(j);
            res = Math.max(res, sum + dfs(i+1, piles, k-j-1, dp));
        }
        return dp[i][k] = res;
    }
}
