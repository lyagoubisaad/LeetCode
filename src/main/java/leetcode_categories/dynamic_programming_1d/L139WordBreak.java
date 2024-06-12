package leetcode_categories.dynamic_programming_1d;

import java.util.HashSet;
import java.util.List;

public class L139WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>();
        return dfs(s, wordDict, set);
    }

    private boolean dfs(String s, List<String> wordDict, HashSet<String> set) {
        if(set.contains(s)) return false;
        if(s.length() == 0) return true;
        for (int i=0;i<s.length();i++) {
            if(wordDict.contains(s.substring(0,i+1))) {
                if(dfs(s.substring(i+1), wordDict, set)) return true;
            }
        }
        set.add(s);
        return false;
    }
}
