package leetcode_categories.string;

import java.util.*;

public class L49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String >> map = new HashMap<>();
        for (String str : strs) {
            char[] wordArray = str.toCharArray();
            Arrays.sort(wordArray);
            String word = new String(wordArray);
            map.computeIfAbsent(word, val -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
