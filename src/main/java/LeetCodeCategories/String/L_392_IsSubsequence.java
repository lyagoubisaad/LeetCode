package LeetCodeCategories.String;

public class L_392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int a = 0;
        while (a < s.length()) {
            for (int i=0;i<t.length();i++) {
                if(s.charAt(a) == t.charAt(i)) {
                    a++;
                }
                if(a==s.length()) return true;
            }
            break;
        }
        return a==s.length();
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
    }


}
