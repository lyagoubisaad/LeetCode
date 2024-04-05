package leetcode_categories.dynamic_programming_2d;

import java.util.Arrays;

public class L926FlipStringMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int[][] dp = new int[s.length()][2];
        for (int i=0;i<s.length();i++) {
            Arrays.fill(dp[i], -1);
        }
        return Math.min(dfs(0,s, '0', dp), dfs(0,s, '1', dp));
    }

    private int dfs(int i, String s, Character phase, int[][] dp) {
        if(i == s.length()) return 0;
        if(dp[i][phase == '0'?0:1] != -1) return dp[i][phase == '0'?0:1];
        int minFlips = Integer.MAX_VALUE;
        if(s.charAt(i) != phase) {
            if(phase == '0') minFlips = dfs(i+1, s, '1', dp);
            minFlips = Math.min(minFlips,1+dfs(i+1, s, phase, dp));
            return minFlips;
        } else minFlips = dfs(i+1, s, phase, dp);
        return dp[i][phase == '0'?0:1] = minFlips;
    }
}
