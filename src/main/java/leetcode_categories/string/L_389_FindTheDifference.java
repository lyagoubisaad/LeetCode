package leetcode_categories.string;

import java.util.HashMap;

public class L_389_FindTheDifference {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if(hm.containsKey(c) && hm.get(c) == 0 || !hm.containsKey(c)) return c;
            else hm.put(c, hm.get(c) - 1);
        }
        return '!';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
    }
}
