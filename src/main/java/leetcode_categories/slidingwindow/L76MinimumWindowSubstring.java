package leetcode_categories.slidingwindow;

public class L76MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        char[] tArray = t.toCharArray();
        int[] tCpt = new int[52];
        for (char c: tArray) {
            if(c-'A' < 26) tCpt[c-'A']++;
            else tCpt[c-'a'+26]++;
        }
        int leftIdx = 0;
        int rightIdx = s.length();
        int left = 0;
        int right = t.length()-1;
        char c;
        for (int i=0;i<right;i++) {
            c = s.charAt(i);
            if(c-'A' < 26) tCpt[c-'A']--;
            else tCpt[c-'a'+26]--;
        }
        boolean flag;
        while (right < s.length()) {
            c = s.charAt(right);
            if(c-'A' < 26) tCpt[c-'A']--;
            else tCpt[c-'a'+26]--;
            flag = false;
            for (int i=0;i<52;i++) {
                if(tCpt[i] > 0) {
                    flag = true;
                    break;
                }
            }
            int nbr;
            if(!flag) {
                c = s.charAt(left);
                nbr = c-'A' < 26 ? c-'A': c-'a'+26;
                while (tCpt[nbr] < 0) {
                    tCpt[nbr]++;
                    left++;
                    c = s.charAt(left);
                    nbr = c-'A' < 26 ? c-'A': c-'a'+26;
                }
                if(right - left < rightIdx - leftIdx) {
                    rightIdx = right;
                    leftIdx = left;
                }
            }
            right++;
        }
        if(rightIdx == s.length()) return "";
        else return s.substring(leftIdx, rightIdx+1);
    }
}
