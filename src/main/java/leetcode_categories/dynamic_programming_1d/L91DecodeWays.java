package leetcode_categories.dynamic_programming_1d;

import java.util.HashMap;

public class L91DecodeWays {
    public int numDecodings(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        return dfs(s, map);
    }

    private int dfs(String s, HashMap<String, Integer> map) {
        if(s.length() == 0) return 1;
        if(s.charAt(0) == '0') return 0;
        if(s.length() == 1) return 1;
        if(!map.containsKey(s)) {
            int one = dfs(s.substring(1), map);
            int two = (Integer.parseInt(s.substring(0, 2)) < 27) ? dfs(s.substring(2), map) : 0;
            map.put(s, one + two);
        }
        return map.get(s);
    }
}
