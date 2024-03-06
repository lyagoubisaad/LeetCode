package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class L_785_IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        int length = graph.length;
        int[] nodes = new int[length];
        Arrays.fill(nodes, -1);
        HashMap<Integer, List<Integer>> mapGraph = new HashMap<>();
        for (int i=0;i<graph.length;i++) {
            List<Integer> neighbors = new ArrayList<>();
            for (int j = 0; j < graph[i].length; j++) {
                neighbors.add(graph[i][j]);
            }
            mapGraph.put(i, neighbors);
        }
        int color = 1;
        for (int i=0;i<nodes.length;i++) {
            if(nodes[i] == -1) {
                if(!dfs(i, nodes, mapGraph, color)) return false;
            }
            color = 1-color;
        }
        return true;
    }

    private boolean dfs(int node, int[] nodes, HashMap<Integer, List<Integer>> mapGraph, int color) {
        if(nodes[node] == -1) nodes[node] = color;
        else if(nodes[node] == color) return true;
        else if(nodes[node] != color) return false;
        for (int elem: mapGraph.get(node)) if(!dfs(elem, nodes, mapGraph, 1-color)) return false;
        return true;
    }
}
