package LeetCodeCategories.Graphs;

import java.util.ArrayList;
import java.util.List;

class L_1857_LargestColorValueDirectedGraph {
    public int largestPathValue(String colors, int[][] edges) {
        int colorLength = colors.length();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < colorLength; i++) graph.add(new ArrayList<>());
        for (int[] edge : edges) graph.get(edge[0]).add(edge[1]);
        boolean[] seen = new boolean[colorLength];
        int[][] count = new int[colorLength][26];
        int max = 0;
        int dfsResult;
        for (int i = 0; i < colorLength; i++) {
            if (count[i][colors.charAt(i)-'a'] == 0) {
                dfsResult = dfs(i, graph, count, seen, colors);
                if (dfsResult == -1) return -1;
                max = Math.max(max, dfsResult);
            }
        }
        return max;
    }

    private int dfs(int start, List<List<Integer>> graph, int[][] count, boolean[] seen, String colors) {
        if (seen[start]) return -1;
        seen[start] = true;
        int max = 0;
        for (int next : graph.get(start)) {
            int colorIndex = colors.charAt(next) - 'a';
            if (count[next][colorIndex] == 0 && dfs(next, graph, count, seen, colors) == -1) return -1;
            seen[next] = false;
            for (int i = 0; i < 26; i++) {
                count[start][i] = Math.max(count[start][i], count[next][i]);
                max = Math.max(max, count[start][i]);
            }
        }
        int color = colors.charAt(start) - 'a';
        count[start][color]++;
        max = Math.max(max, count[start][color]);
        return max;
    }
}
