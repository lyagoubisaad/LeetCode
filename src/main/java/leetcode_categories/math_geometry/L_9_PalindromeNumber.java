package leetcode_categories.math_geometry;

import java.util.ArrayList;

public class L_9_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        ArrayList t = new ArrayList();
        for(int i=0;i<s.length();i++) {
            t.add(s.charAt(i));
        }
        if(s.length()%2 == 0) {
            for (int i=0;i<t.size();i++) {
                if(!t.get(i).equals(t.get(t.size()-1-i))) return false;
            }
            return true;
        }
        int a = t.size()/2;
        for(int i=0;i<=a;i++) {
            if(!t.get(a-i).equals(t.get(a+i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
}
