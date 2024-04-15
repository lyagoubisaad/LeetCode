package leetcode_categories.arrays_hashings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L438FindAllAnagramsString {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length() > s.length()) return new ArrayList<>();
        int[] second = new int[26];
        int[] first = new int[26];
        List<Integer> result = new ArrayList<>();
        for (char c: p.toCharArray()) {
            second[c-'a']++;
        }
        for (int i=0;i<p.length();i++) {
            first[s.charAt(i)-'a']++;
        }
        if(Arrays.compare(first, second) == 0) result.add(0);
        for (int i=1;i<s.length();i++) {
            if(i+p.length() > s.length()) break;
            first[s.charAt(i-1)-'a']--;
            first[s.charAt(i+p.length()-1)-'a']++;
            if(Arrays.compare(first, second) == 0) result.add(i);
        }
        return result;
    }
}
