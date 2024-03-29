package leetcode_categories.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class L_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max=0;
        Set<Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++) {
            if(!set.add(s.charAt(i))) {
                while (s.charAt(left) != s.charAt(i)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
            max = Math.max(max, i-left+1);
        }
        return Math.max(max, s.length()-left);
    }
}
