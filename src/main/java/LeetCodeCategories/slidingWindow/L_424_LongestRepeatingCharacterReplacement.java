package LeetCodeCategories.slidingWindow;

import java.util.HashMap;

public class L_424_LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int l=0, r=0;
        HashMap<Character,Integer> store = new HashMap();
        int max = 0;
        int length = 0;
        while (r<s.length()) {
            store.put(s.charAt(r),store.getOrDefault(s.charAt(r),0)+1);
            r++;
            for (int value: store.values()) {
                max = Math.max(max, value);
            }
            if(r-l-max > k) {
                store.put(s.charAt(l),store.getOrDefault(s.charAt(l),0)-1);
                l++;
            }
            length = Math.max(length, r-l);
        }
        return length;
    }
}