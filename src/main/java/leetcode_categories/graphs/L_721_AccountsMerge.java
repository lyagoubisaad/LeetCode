package leetcode_categories.graphs;

import java.util.*;

public class L_721_AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String, Set<String>> map = new HashMap<>();
        for (List<String> account : accounts) {
            for (int j = 1; j < account.size(); j++) {
                for (int k = j+1; k < account.size(); k++) {
                    map.computeIfAbsent(account.get(j), val -> new HashSet<>()).add(account.get(k));
                    map.computeIfAbsent(account.get(k), val -> new HashSet<>()).add(account.get(j));
                }
            }
        }
        HashSet<String> seen = new HashSet<>();
        Iterator<List<String>> iterator = accounts.iterator();
        while (iterator.hasNext()) {
            List<String> account = iterator.next();
            if (account.size() == 2) continue;
            if (seen.contains(account.get(1))) {
                iterator.remove();
                continue;
            }
            List<String> tmp = new ArrayList<>();
            dfs(account.get(1), map, seen, tmp);
            Collections.sort(tmp);
            tmp.add(0, account.get(0));
            accounts.set(accounts.indexOf(account), tmp);
        }
        return accounts;
    }

    private List<String> dfs(String key, HashMap<String, Set<String>> map, HashSet<String> seen, List<String> result) {
        result.add(key);
        seen.add(key);
        for (String elem: map.getOrDefault(key, new HashSet<>())) {
            if(seen.contains(elem)) continue;
            dfs(elem, map, seen, result);
        }
        return result;
    }
}
