package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.Arrays;

public class L_1143_LongestCommonSubsequence {

    /*  Bottom-up DP
    For every i in text1, j in text2, we will choose one of the following two options:

    if two characters match, length of the common subsequence would be 1 plus the length of the common subsequence till the i-1 and j-1 indexes
    if two characters doesn't match, we will take the longer by either skipping i or j indexes
     */

    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int i=0;i<dp.length;i++) {
            Arrays.fill(dp[i], 0);
        }
        for (int i=1;i<=text1.length();i++) {
            for (int j=1;j<=text2.length();j++) {
                if(text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }

            }
        }
        return dp[text1.length()][text2.length()];
    }

    //top down DP ==> brute force + memo
    public int topDown(String text1, String text2) {
        int[][] memo = new int[text1.length()][text2.length()];
        for (int i=0;i<memo.length;i++) {
            Arrays.fill(memo[i], -1);
        }
        return helper(text1, text2, 0, 0, memo);
    }

    private int helper(String text1, String text2, int i, int j, int[][] memo) {
        if(i== text1.length() || j== text2.length()) return 0;
        if(memo[i][j] != -1) return memo[i][j];
        if(text1.charAt(i) == text2.charAt(j)) return memo[i][j] = 1+helper(text1, text2, i+1, j+1, memo);
        return memo[i][j] = Math.max(helper(text1,text2, i+1, j, memo), helper(text1, text2, i, j+1, memo));
    }
}
