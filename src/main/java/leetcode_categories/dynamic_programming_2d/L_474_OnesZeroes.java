package leetcode_categories.dynamic_programming_2d;

public class L_474_OnesZeroes {

    public int findMaxForm(String[] strs, int m, int n) {
        int result = 0;
        int[][][] dp = new int [strs.length][m+1][n+1];
        for (int i=0;i<strs.length;i++) {
            result = Math.max(result, dfs(i, strs, m, n,dp));
        }
        return result;
    }

    private int dfs(int i, String[] strs, int m, int n, int[][][] dp) {
        if(i == strs.length) return 0;
        if(dp[i][m][n] != 0) return dp[i][m][n];
        int zero = 0;
        int one = 0;
        for (int j=0;j<strs[i].length();j++) {
            if(strs[i].charAt(j) == '0') zero++;
            else one++;
        }
        int skip = dfs(i+1, strs, m, n,dp);
        if(zero > m || one > n) return dp[i][m][n] = skip;
        int take = 1+dfs(i+1, strs, m-zero, n-one, dp);
        return dp[i][m][n] = Math.max(skip, take);
    }

    public int findMaxFormV1(String[] strs, int m, int n) {
        int[][] dp = new int [m+1][n+1];
        for (String str : strs) {
            int zero = 0;
            int one = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') zero++;
                else one++;
            }
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - zero][j - one] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
