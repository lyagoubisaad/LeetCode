package leetcode_categories.graphs;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class L_1129_ShortestPathwithAlternatingColors {

    int length;
    int[][] result;

    public int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        this.length = n;
        result = new int[n][2];
        for (int i=0;i< result.length;i++) {
            result[i][0] = Integer.MAX_VALUE;
            result[i][1] = Integer.MAX_VALUE;
        }
        HashMap<Integer, Queue<Integer>> redEdgesMap = new HashMap<>();
        HashMap<Integer, Queue<Integer>> blueEdgesMap = new HashMap<>();

        for (int[] redEdge : redEdges) {
            redEdgesMap.computeIfAbsent(redEdge[0], key -> new ArrayDeque<>()).add(redEdge[1]);
        }

        for (int[] blueEdge : blueEdges) {
            blueEdgesMap.computeIfAbsent(blueEdge[0], key -> new ArrayDeque<>()).add(blueEdge[1]);
        }
        if (!redEdgesMap.isEmpty() && redEdgesMap.containsKey(0)) {
            bfs(new ArrayDeque<>(List.of(0)), redEdgesMap, blueEdgesMap, 0);
        }
        if (!blueEdgesMap.isEmpty() && blueEdgesMap.containsKey(0)) {
            bfs(new ArrayDeque<>(List.of(0)), redEdgesMap, blueEdgesMap, 1);
        }

        int[] minValues = new int[result.length];
        for (int i = 0; i < result.length; i++) {
            minValues[i] = Math.min(result[i][0], result[i][1]);
            if(minValues[i] == Integer.MAX_VALUE) minValues[i] = -1;
        }
        minValues[0] = 0;
        return minValues;
    }

    private void bfs(Queue<Integer> queue, HashMap<Integer, Queue<Integer>> redEdges, HashMap<Integer, Queue<Integer>> blueEdges, int color) {
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                if(result[curr][color] < length) continue;
                result[curr][color] = Math.min(length, result[curr][color]);
                HashMap<Integer, Queue<Integer>> edges = (color == 0) ? redEdges : blueEdges;
                if (edges.containsKey(curr)) {
                    for (int neighbor : edges.get(curr)) {
                        if (neighbor <= this.length) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
            length++;
            color = 1 - color;
        }
    }
}
