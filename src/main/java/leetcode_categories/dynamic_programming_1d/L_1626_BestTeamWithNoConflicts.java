package leetcode_categories.dynamic_programming_1d;

import java.util.Arrays;

public class L_1626_BestTeamWithNoConflicts {
    public int bestTeamScore(int[] scores, int[] ages) {
        int[][] players = new int[scores.length][2];
        for (int i = 0; i < scores.length; i++) {
            players[i][0] = scores[i];
            players[i][1] = ages[i];
        }
        Arrays.sort(players,(a,b)->a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);

        int[][] dp = new int[players.length][players.length+1];
        return helper(0, players, dp, -1);
    }

    private int helper(int idx, int[][] players, int[][] dp, int prv) {
        if (idx == players.length) return 0;
        if(dp[idx][prv+1] != 0) return dp[idx][prv+1];
        dp[idx][prv+1] = helper(idx + 1, players, dp, prv);
        if (prv == -1 || players[idx][0] >= players[prv][0]) {
            dp[idx][prv+1] = Math.max(dp[idx][prv+1],players[idx][0]+helper(idx + 1, players, dp, idx));
        }
        return dp[idx][prv+1];
    }
}
