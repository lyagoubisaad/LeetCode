package leetcode_categories.graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class L_1557_MinimumNumberVerticesReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            set.add(i);
        }
        for (List<Integer> edge : edges) {
            set.remove(edge.get(1));
        }
        return new ArrayList<>(set);
    }
}
