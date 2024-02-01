package LeetCodeCategories.oneD_DynamicProgramming;

public class L_647_PalindromicSubstrings {
    public int countSubstrings(String s) {
        int res= 0;
        for (int i=0;i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
                if(isPalindrome(s.substring(i,j+1))) {
                    res++;
                }
            }
        }
        return res;
    }

    private boolean isPalindrome(String substring) {
        if(substring.length() == 0) return false;
        if(substring.length() == 1) return true;
        int i=0;
        int j=substring.length()-1;
        while (i<j) {
            if(substring.charAt(i) != substring.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        new L_647_PalindromicSubstrings().countSubstrings("abc");
    }
}
