package leetcode_categories.two_pointers;

public class L_680_ValidPalindromeII {

    public static boolean validPalindrome(String s) {
        return helper(s, 0, s.length()-1, 2);
    }

    private static boolean helper(String s, int i, int j, int lives) {
        if(lives == 0) return false;
        while (i<j && lives > 0) {
            if(s.charAt(i) != s.charAt(j)) {
                return helper(s, i+1, j, lives-1) || helper(s, i, j-1, lives-1);
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga");
    }
}
