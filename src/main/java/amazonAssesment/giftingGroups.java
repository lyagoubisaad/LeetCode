package amazonAssesment;

import java.util.*;

public class giftingGroups {
    public int countGroups(List<String> related) {
        int numberOfSubscribers = related.get(0).length();
        HashMap<Integer,List<Integer>> relations = new HashMap<>();
        for (int i=0;i<numberOfSubscribers;i++) {
            String row = related.get(i);
            for (int j=0;j<numberOfSubscribers;j++) {
                if(row.charAt(j) == '1') relations.computeIfAbsent(i, key -> new ArrayList<>()).add(j);
            }
        }
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> keysToRemove = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : relations.entrySet()) {
            if (seen.contains(entry.getKey())) continue;
            Set<Integer> result = new HashSet<>();
            dfs(entry.getKey(), seen, relations, result);
            for (int elem : result) {
                if (elem != entry.getKey()) {
                    keysToRemove.add(elem);
                    relations.computeIfAbsent(entry.getKey(), key -> new ArrayList<>()).add(elem);
                }
            }
        }
        for (int key : keysToRemove) {
            relations.remove(key);
        }
        return relations.size();
    }

    private Set<Integer> dfs(int key, HashSet<Integer> seen, HashMap<Integer, List<Integer>> relations, Set<Integer> result) {
        seen.add(key);
        result.add(key);
        List<Integer> relatives = relations.get(key);
        for (int relative: relatives) {
            if(seen.contains(relative)) continue;
            result.addAll(dfs(relative, seen, relations, result));
        }
        return result;
    }
}
