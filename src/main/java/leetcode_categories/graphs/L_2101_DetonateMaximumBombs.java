package leetcode_categories.graphs;

import java.util.*;

public class L_2101_DetonateMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        int max = 0;
        HashMap<Integer, List<Integer>> map = buildAdjacency(bombs);

        if(map.isEmpty()) return 1;

        for (int i=0;i<bombs.length;i++) {
            if(max == bombs.length) return max;
            max = Math.max(bfs(i, map), max);
        }
        return max;
    }

    private static HashMap<Integer, List<Integer>> buildAdjacency(int[][] bombs) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i< bombs.length; i++) {
            int fX = bombs[i][0];
            int fY = bombs[i][1];
            int fR = bombs[i][2];
            for (int j = i+1; j< bombs.length; j++) {
                int sX = bombs[j][0];
                int sY = bombs[j][1];
                int sR = bombs[j][2];
                double dist = Math.sqrt(Math.pow((fX-sX),2)  + Math.pow((fY-sY),2));
                if(dist <= sR) map.computeIfAbsent(j, val -> new ArrayList<>()).add(i);
                if(dist <= fR) map.computeIfAbsent(i, val -> new ArrayList<>()).add(j);
            }
        }
        return map;
    }

    private int bfs(int start, HashMap<Integer, List<Integer>> map) {
        int max = 0;
        HashSet<Integer> seen = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        seen.add(start);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            max++;
            for (int next : map.getOrDefault(curr, new ArrayList<>())) if(seen.add(next)) queue.offer(next);
        }
        return max;
    }
}
