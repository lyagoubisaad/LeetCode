package leetcode_categories.dynamic_programming_1d;
public class L_516_LongestPalindromicSubsequence {

    L_1143_LongestCommonSubsequence lcs = new L_1143_LongestCommonSubsequence();
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i=s.length();i>=0;i--) {
            sb.append(s.charAt(i));
        }
        return lcs.topDown(s,sb.toString());
    }
}
