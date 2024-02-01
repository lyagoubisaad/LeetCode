package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L_684_RedundantConnection {
    Set<Integer> seen = new HashSet();
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0;i<1000;i++) {
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<edges.length;i++) {
            seen.clear();
            if(!adj.get(edges[i][0]).isEmpty() && !adj.get(edges[i][1]).isEmpty() && dfs(edges[i][0], edges[i][1], adj)) {
                return new int[] {edges[i][0], edges[i][1]};
            }
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        throw new AssertionError();
    }

    public boolean dfs(int source, int target, List<List<Integer>> graph) {
        if (!seen.contains(source)) {
            seen.add(source);
            if (source == target) return true;
            for (int nei: graph.get(source)) {
                if (dfs(nei, target, graph)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
