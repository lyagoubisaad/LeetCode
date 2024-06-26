package leetcode_categories.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class L49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String >> map = new HashMap<>();
        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            map.computeIfAbsent(Arrays.toString(word), val -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }

}
