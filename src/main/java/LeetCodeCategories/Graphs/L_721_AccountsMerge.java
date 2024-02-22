package LeetCodeCategories.Graphs;

import java.util.*;

public class L_721_AccountsMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        boolean[] visited = new boolean[accounts.size()];
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (int i=0;i<accounts.size();i++) {
            if(visited[i]) continue;
            visited[i] = true;
            Set<String> elements = new HashSet<>();
            for (int j = 1; j < accounts.get(i).size(); j++) {
                elements.add(accounts.get(i).get(j));
            }
            for (int j=i+1;j<accounts.size();j++) {
                if(visited[j]) continue;
                boolean flag = false;
                for (String record: elements) {
                    if(accounts.get(j).contains(record)) {
                        flag =true;
                        visited[j] = true;
                        break;
                    }
                }
                if(flag) {
                    for (int k=1;k<accounts.get(j).size();k++) {
                        elements.add(accounts.get(j).get(k));
                    }
                }
            }
            map.put(i, new ArrayList<>(elements));
        }
        List<List<String>> lists = new ArrayList<>();
        for (Map.Entry<Integer, List<String >> entry: map.entrySet()) {
            List<String> record = new ArrayList<>(entry.getValue());
            Collections.sort(record);
            record.add(0, accounts.get(entry.getKey()).get(0));
            lists.add(new ArrayList<>(record));
        }
        return lists;
    }
}
