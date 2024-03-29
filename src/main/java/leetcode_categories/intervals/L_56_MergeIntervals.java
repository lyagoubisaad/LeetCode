package leetcode_categories.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class L_56_MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> list = new ArrayList<>();
        int[] last = intervals[0];
        for (int i=1;i<intervals.length;i++) {
            if(intervals[i][0] <= last[1]) {
                last[0] = Math.min(last[0], intervals[i][0]);
                last[1] = Math.max(last[1], intervals[i][1]);
            } else if(intervals[i][0] > last[1]) {
                list.add(last);
                last = intervals[i];
            }
        }
        list.add(last);
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {

    }
}
