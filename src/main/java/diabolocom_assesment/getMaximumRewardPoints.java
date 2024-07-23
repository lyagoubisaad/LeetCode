package diabolocom_assesment;

import java.util.*;

public class getMaximumRewardPoints {

    public static int getMaximumRewardPoints(int k, List<Integer> reward_1, List<Integer> reward_2) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < reward_2.size(); i++) {
            heap.offer(reward_1.get(i) - reward_2.get(i));
            if (i > 0) reward_2.set(i, reward_2.get(i) + reward_2.get(i - 1));
        }
        while (k-- > 0) reward_2.set(reward_2.size() - 1, reward_2.get(reward_2.size() - 1) + heap.poll());
        return reward_2.get(reward_2.size() - 1);
    }
}
