package leetcode_categories.dynamic_programming_1d;

import java.util.*;

public class L_472_ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (dfs(word, set, word, new HashMap<>())) {
                result.add(word);
            }
        }
        return result;
    }
    private boolean dfs(String word, HashSet<String> set, String flag, HashMap<String, Boolean> memo) {
        if(memo.containsKey(word)) return memo.get(word);
        for (int i=0;i<word.length();i++) {
            String subString = word.substring(0, i+1);
            if(set.contains(subString) && !subString.equals(flag)) {
                if(dfs(word.substring(i+1), set, flag, memo) || i+1 == word.length()) {
                    memo.put(word, true);
                    return true;
                }
            }
        }
        memo.put(word, false);
        return memo.get(word);
    }
}
