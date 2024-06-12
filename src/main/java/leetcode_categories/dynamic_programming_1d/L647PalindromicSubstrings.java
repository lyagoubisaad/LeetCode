package leetcode_categories.dynamic_programming_1d;

public class L647PalindromicSubstrings {
    public int countSubstrings(String s) {
        int countSubstrings = 0;
        for (int i=0;i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
                if(isPalindrome(s.substring(i,j+1))) countSubstrings++;
            }
        }
        return countSubstrings;
    }

    private boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
