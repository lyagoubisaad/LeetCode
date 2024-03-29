package leetcode_categories.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class L_1921_EliminateMaximumNumberofMonsters {
    public static int eliminateMaximum(int[] dist, int[] speed) {
        Integer[] idx  = new Integer[dist.length];
        for (int i=0;i<idx.length;i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, Comparator.comparingDouble(i -> (double) dist[i] / speed[i]));
        int killed = 1;
        for (int i=1;i<idx.length;i++) {
            int pos = dist[idx[i]] - speed[idx[i]]*i;
            if(pos <= 0) break;
            killed++;
        }
        return killed;
    }
}
