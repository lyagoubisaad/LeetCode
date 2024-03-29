package leetcode_categories.string;

public class L_242_Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        for (int i: freq) {
            if(i != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
