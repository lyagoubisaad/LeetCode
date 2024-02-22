package LeetCodeCategories.Graphs;

import java.util.*;

public class L_1462_CourseScheduleIV {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        Map<Integer, Set<Integer>> adjacents = new HashMap<>();
        for (int[] prerequisite : prerequisites) if (prerequisite.length != 0) adjacents.computeIfAbsent(prerequisite[0], key -> new HashSet<>()).add(prerequisite[1]);
        Map<Integer, Set<Integer>> prerequisitesMap = new HashMap<>();
        List<Boolean> answers = new ArrayList<>();
        for (int[] query : queries) {
            dfs(query[0], adjacents, prerequisitesMap);
            answers.add(prerequisitesMap.get(query[0]).contains(query[1]));
        }
        return answers;
    }

    private void dfs(int i, Map<Integer, Set<Integer>> directPrerequisites, Map<Integer, Set<Integer>> prerequisitesMap) {
        if (!prerequisitesMap.containsKey(i)) {
            Set<Integer> prerequisitesSet = new HashSet<>();
            for (int elem : directPrerequisites.getOrDefault(i, Collections.emptySet())) {
                dfs(elem, directPrerequisites, prerequisitesMap);
                prerequisitesSet.addAll(prerequisitesMap.get(elem));
                prerequisitesSet.add(elem);
            }
            prerequisitesMap.put(i, prerequisitesSet);
        }
    }
}
