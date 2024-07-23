package leetcode_categories.graphs;

import java.util.*;

public class L207CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        int[] degree = new int[numCourses];
        for (int[] prerequisite : prerequisites) {
            adj.computeIfAbsent(prerequisite[1], val -> new ArrayList<>()).add(prerequisite[0]);
            degree[prerequisite[0]]++;
        }
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i=0;i<degree.length;i++) {
            if(degree[i] == 0) {
                queue.add(i);
            }
        }
        int doneCourses = 0;
        while (!queue.isEmpty()) {
            int element = queue.poll();
            doneCourses++;
            if(!adj.containsKey(element)) continue;
            for (int neighbour: adj.get(element)) {
                degree[neighbour]--;
                if(degree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }
        return doneCourses == numCourses;
    }
}
