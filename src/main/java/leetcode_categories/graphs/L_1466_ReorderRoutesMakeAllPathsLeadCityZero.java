package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class L_1466_ReorderRoutesMakeAllPathsLeadCityZero {
    int cpt = 0;
    HashSet<String> oldGraphs = new HashSet<>();
    HashSet<Integer> seen = new HashSet<>();
    HashMap<Integer, List<Integer>> relations = new HashMap<>();
    public int minReorder(int n, int[][] connections) {
        for (int[] connection: connections) {
            int a = connection[0];
            int b = connection[1];
            oldGraphs.add(a + "->" + b);
            relations.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            relations.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }
        dfs(0, -1);
        return cpt;
    }

    private void dfs(int curr, int idx) {
        if(seen.contains(curr)) return;
        seen.add(curr);
        if(oldGraphs.contains(idx + "->" + curr)) cpt++;
        for (int elem: relations.get(curr)) {
            dfs(elem, curr);
        }
    }
}
