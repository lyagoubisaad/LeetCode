package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L_802_FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> terminalNode = new HashSet<>();
        List<Integer> safeNodes = new ArrayList<>();
        for (int i=0;i<graph.length;i++) if(dfs(i, visited, terminalNode, graph)) safeNodes.add(i);
        return safeNodes;
    }

    private boolean dfs(int i, Set<Integer> visited, Set<Integer> terminalNode, int[][] graph) {
        if(!visited.add(i)) return terminalNode.contains(i);
        for (int elem: graph[i]) if(!dfs(elem, visited, terminalNode, graph)) return false;
        terminalNode.add(i);
        return true;
    }
}
