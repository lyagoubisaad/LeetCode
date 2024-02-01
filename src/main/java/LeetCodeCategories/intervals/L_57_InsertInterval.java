package LeetCodeCategories.intervals;

import java.util.ArrayList;
import java.util.List;

public class L_57_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval == null || interval[1] < newInterval[0]) res.add(
                    interval
            ); else if (interval[0] > newInterval[1]) {
                res.add(newInterval);
                res.add(interval);
                newInterval = null;
            } else {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        if (newInterval != null) res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(new L_57_InsertInterval().insert(new int[][] {{1,2}, {3,5}, {6,7}, {8,10}, {12,16}}, new int[] {4,8}));
    }
}
