package LeetCodeCategories.DynamicProgramming_OneD;

import java.util.*;

public class L_472_ConcatenatedWords {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        HashSet<String> set = new HashSet<>(Arrays.asList(words));
        List<String> result = new ArrayList<>();
        HashMap<String, Boolean> map = new HashMap<>();
        for (String word : words) {
            if(dfs(word, set, word, map)) result.add(word);
        }
        return result;
    }
    private boolean dfs(String word, HashSet<String> set, String flag, HashMap<String, Boolean> map) {
        if(word.equals("a")) {
            if(map.containsKey("a")) return map.get("a");
        }
        if(map.containsKey(word)) return map.get(word);
        for (int i=0;i<word.length();i++) {
            String subString = word.substring(0, i+1);
            if(set.contains(subString) && !subString.equals(flag)) {
                if(dfs(word.substring(i+1), set, flag, map) || i+1 == word.length()) {
                    map.put(word, true);
                    return true;
                }
            }
        }
        if(word.equals(flag)) return false;
        map.put(word, false);
        return map.get(word);
    }
}
