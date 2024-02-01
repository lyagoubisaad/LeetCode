package LeetCodeCategories.TwoPointers;

public class L_125_ValidPalindrome {

    public static String remove(String value) {
        return value.replaceAll("/[^A-Za-z0-9 ]/", "");
    }
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int beg = 0;
        int end = s.length()-1;
        while (beg < end) {
            if(s.charAt(beg) == s.charAt(end)) {
                beg++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
