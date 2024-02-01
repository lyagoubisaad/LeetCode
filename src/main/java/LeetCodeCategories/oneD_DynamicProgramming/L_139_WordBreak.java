package LeetCodeCategories.oneD_DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class L_139_WordBreak {

    List<String> wordDict;
    HashMap<String, Boolean> store;
    public boolean wordBreak(String s, List<String> wordDict) {
        this.wordDict = wordDict;
        store = new HashMap<>();
        return helper(s);
    }

    public boolean helper(String s) {
        if(s.length() == 0) return true;
        if(wordDict.contains(s)) return true;
        if(store.containsKey(s)) return store.get(s);
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            sb.append(s.charAt(i));
            if(wordDict.contains(sb.toString())) {
                if(helper(s.substring(i+1))) {
                    store.put(s, true);
                    return true;
                }
            }
        }
        store.put(s, false);
        return false;
    }

    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<>();
        wordDict.add("aaa");
        wordDict.add("aaaa");
        new L_139_WordBreak().wordBreak("aaaaaaa", wordDict);
    }
}
