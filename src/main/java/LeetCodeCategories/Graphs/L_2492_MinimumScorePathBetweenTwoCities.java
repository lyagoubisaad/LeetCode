package LeetCodeCategories.Graphs;

import java.util.*;

public class L_2492_MinimumScorePathBetweenTwoCities {
    public int minScore(int n, int[][] roads) {
        HashMap<Integer, List<int[]>> graph = new HashMap<>();
        HashMap<Integer, Integer> minDist = new HashMap<>();
        for (int[] road: roads) {
            graph.computeIfAbsent(road[0], val -> new ArrayList<>()).add(new int[] {road[1], road[2]});
            graph.computeIfAbsent(road[1], val -> new ArrayList<>()).add(new int[] {road[0], road[2]});
            minDist.put(road[0], Math.min(minDist.getOrDefault(road[0], Integer.MAX_VALUE), road[2]));
            minDist.put(road[1], Math.min(minDist.getOrDefault(road[1], Integer.MAX_VALUE), road[2]));
        }
        HashSet<Integer> seen = new HashSet<>();
        dfs(1, seen, graph);
        int result = Integer.MAX_VALUE;
        for (int node: seen) {
            result = Math.min(result, minDist.get(node));
        }
        return result;
    }

    private void dfs(int node, HashSet<Integer> seen, HashMap<Integer, List<int[]>> graph) {
        if(seen.add(node)) {
            for (int[] comb: graph.get(node)) {
                dfs(comb[0], seen, graph);
            }
        }
    }
}
