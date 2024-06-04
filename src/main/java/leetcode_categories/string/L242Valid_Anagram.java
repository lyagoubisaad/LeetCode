package leetcode_categories.string;

public class L242Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        int[] cpt = new int[26];
        for (char c: s.toCharArray()) {
            cpt[c-'a']++;
        }
        for (char c : t.toCharArray()) {
            cpt[c-'a']--;
            if(cpt[c-'a'] < 0) return false;
        }
        for (int i=0;i<26;i++) {
            if(cpt[i] > 0) return false;
        }
        return true;
    }
}
