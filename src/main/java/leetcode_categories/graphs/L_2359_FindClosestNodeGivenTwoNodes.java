package leetcode_categories.graphs;

import java.util.HashSet;

public class L_2359_FindClosestNodeGivenTwoNodes {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        if(edges[node1] == -1 && edges[node2] == -1) return -1;
        return dfs(edges, node1, node2, new HashSet<>(), new HashSet<>());
    }

    private int dfs(int[] edges, int node1, int node2, HashSet<Integer> visitedOne, HashSet<Integer> visitedTwo) {
        if(node1 == node2) return node1;
        boolean flag = !visitedOne.add(node1);
        flag &= !visitedTwo.add(node2);
        if(flag) return -1;
        if(visitedTwo.contains(node1) && visitedOne.contains(node2)) return Math.min(node1, node2);
        if(visitedTwo.contains(node1)) return node1;
        if(visitedOne.contains(node2)) return node2;
        node1 = edges[node1] == -1 ? node1: edges[node1];
        node2 = edges[node2] == -1 ? node2: edges[node2];
        return dfs(edges, node1, node2, visitedOne, visitedTwo);
    }
}
