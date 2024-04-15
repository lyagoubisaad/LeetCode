package leetcode_contests.c_14_04_24;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class L100267KSmallestAmountWithSingleDenominationCombination {
    public long findKthSmallest(int[] coins, int k) {
        HashSet<Long> set = new HashSet<>();
        PriorityQueue<long[]> queue = new PriorityQueue<>(Comparator.comparingLong(a -> a[0] + a[1]));
        for (int coin:coins) {
            queue.add(new long[]{0, coin});
        }
        long last = 0;
        while (set.size() < k) {
            long[] val = queue.poll();
            long sum = val[0]+val[1];
            queue.offer(new long[] {sum, val[1]});
            set.add(sum);
            last = sum;
        }
        return last;
    }
}
