package NonLeetCode;

import java.util.*;

public class TwoInterns {
    public static int getMaximumRewardPoints(int k, int[] reward_1, int[] reward_2) {
        int n = reward_1.length;
        int max = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, List<Integer>> store = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int difference = reward_1[i] - reward_2[i];
            store.computeIfAbsent(difference, key -> new ArrayList<>()).add(i);
            heap.offer(difference);
        }
        Set<Integer> selectedIndices = new HashSet<>();
        while (k > 0 && !heap.isEmpty()) {
            int currentDiff = heap.poll();
            List<Integer> indices = store.get(currentDiff);
            int index = indices.remove(0);
            selectedIndices.add(index);
            if (indices.isEmpty()) store.remove(currentDiff);
            k--;
        }
        for (int i = 0; i < n; i++) {
            max += selectedIndices.contains(i) ? reward_1[i] : reward_2[i];
        }
        return max;
    }

}
