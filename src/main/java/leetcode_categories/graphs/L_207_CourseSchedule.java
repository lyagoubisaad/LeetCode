package leetcode_categories.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class L_207_CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] degree = new int[numCourses];
        for (int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        for (int i=0;i<prerequisites.length;i++) {
            int firstElement = prerequisites[i][0];
            int secondElement = prerequisites[i][1];
            adj.get(secondElement).add(firstElement);
            degree[firstElement]++;
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
            for (int neighbour: adj.get(element)) {
                degree[neighbour]--;
                if(degree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }
        return doneCourses == numCourses;
    }

    public static void main(String[] args) {
        new L_207_CourseSchedule().canFinish(2, new int[][] {{1,0}, {0,2}, {2,1}});
    }
}
