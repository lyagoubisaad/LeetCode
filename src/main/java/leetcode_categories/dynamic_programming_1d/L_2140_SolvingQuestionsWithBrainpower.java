package leetcode_categories.dynamic_programming_1d;

public class L_2140_SolvingQuestionsWithBrainpower {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length+1];
        return helper(questions, 0, dp);
    }

    private long helper(int[][] questions, int idx, long[] dp) {
        if (idx >= questions.length) return 0;
        if(dp[idx] != 0) return dp[idx];
        return dp[idx] = Math.max(questions[idx][0] + helper(questions, idx + questions[idx][1]+1, dp), helper(questions, idx + 1, dp));
    }
}
