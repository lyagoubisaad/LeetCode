package leetcode_categories.graphs;

import java.util.*;

public class L310MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }
        List<Set<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new HashSet<>());
        }
        int[] degrees = new int[n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
            degrees[u]++;
            degrees[v]++;
        }
        Queue<Integer> leaves = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (degrees[i] == 1) {
                leaves.offer(i);
            }
        }
        while (n > 2) {
            int leavesSize = leaves.size();
            n -= leavesSize;
            for (int i = 0; i < leavesSize; i++) {
                int leaf = leaves.poll();
                for (int neighbor : adjList.get(leaf)) {
                    degrees[neighbor]--;
                    if (degrees[neighbor] == 1) {
                        leaves.offer(neighbor);
                    }
                }
            }
        }
        result.addAll(leaves);
        return result;
    }
}
