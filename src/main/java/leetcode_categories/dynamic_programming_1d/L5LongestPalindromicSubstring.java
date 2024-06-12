package leetcode_categories.dynamic_programming_1d;

public class L5LongestPalindromicSubstring {

    int lo = 0;
    int maxL = 0;
    public String longestPalindrome(String s) {
        for (int i=0;i<s.length();i++) {
            dfs(i,i, s);
            dfs(i-1, i, s);
        }
        return s.substring(lo, maxL);
    }

    private void dfs(int left, int right, String s) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(maxL - lo < right - left) {
            lo = left+1;
            maxL = right;
        }
    }
}
