package LeetCodeCategories.Graphs;
import java.util.*;

public class L_210_CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        int[] res = new int[numCourses];
        while (!queue.isEmpty()) {
            int element = queue.poll();
            res[doneCourses] = element;
            doneCourses++;
            for (int neighbour: adj.get(element)) {
                degree[neighbour]--;
                if(degree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }
        if(doneCourses != numCourses) return new int[0];
        return res;
    }

    public static void main(String[] args) {
        new L_210_CourseScheduleII().findOrder(4, new int[][] {{1,0}, {2,0}, {3,1}, {3,2}});
    }
}
