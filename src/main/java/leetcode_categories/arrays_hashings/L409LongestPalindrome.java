package leetcode_categories.arrays_hashings;

public class L409LongestPalindrome {
    public int longestPalindrome(String s) {
        char[] word = s.toCharArray();
        int[] lowerCase = new int[26];
        int[] upperCase = new int[26];
        int val;
        for (char c: word) {
            val = c-'a';
            if(val >= 0) lowerCase[c-'a']++;
            else upperCase[c-'A']++;
        }
        int longestPalindrome = 0;
        boolean flag = true;
        for (int i=0;i<26;i++) {
            longestPalindrome += (lowerCase[i]/2)*2;
            longestPalindrome += (upperCase[i]/2)*2;
            if(flag) {
                if(lowerCase[i]%2 != 0 || upperCase[i]%2 != 0) {
                    longestPalindrome++;
                    flag = false;
                }
            }
        }
        return longestPalindrome;
    }
}
