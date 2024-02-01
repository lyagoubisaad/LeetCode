package LeetCodeCategories.oneD_DynamicProgramming;

import static LeetCodeCategories.oneD_DynamicProgramming.L_1143_LongestCommonSubsequence.longestCommonSubsequence;

public class L_516_LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length();i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return longestCommonSubsequence(s,sb.toString());
    }
}
