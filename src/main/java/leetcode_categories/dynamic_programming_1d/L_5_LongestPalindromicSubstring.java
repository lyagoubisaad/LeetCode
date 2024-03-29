package leetcode_categories.dynamic_programming_1d;

public class L_5_LongestPalindromicSubstring {
    int lo=0;
    int maxLen=0;
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        for (int i=1;i<s.length();i++) {
            helper(s, i,i);
            helper(s,i,i-1);
        }
        return s.substring(lo,lo+maxLen);
    }

    private void helper(String s, int left, int right) {
        while (left>=0 && right<= s.length()-1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(maxLen < right-left-1) {
            lo = left+1;
            maxLen = right-left-1;
        }
    }

    public static void main(String[] args) {
        new L_5_LongestPalindromicSubstring().longestPalindrome("bb");
    }
}
