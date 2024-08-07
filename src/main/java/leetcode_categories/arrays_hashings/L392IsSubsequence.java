package leetcode_categories.arrays_hashings;

public class L392IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        for (int i=0;i<t.length();i++) {
            if(idx == s.length()) return true;
            if(s.charAt(idx) == t.charAt(i)) idx++;
        }
        return idx == s.length();
    }
}
