package LeetCodeCategories.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class L_435_NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int[] last = intervals[0];
        int cpt = 0;
        for (int i=1;i<intervals.length;i++) {
            if(intervals[i][0] < last[1]) {
                cpt++;
            } else {
                last = intervals[i];
            }
        }
        return cpt;
    }

    public static void main(String[] args) {
        System.out.println(new L_435_NonOverlappingIntervals().eraseOverlapIntervals(new int[][]
                {{-52,31},{-73,-26},{82,97},{-65,-11},{-62,-49},{95,99},{58,95},{-31,49},{66,98},{-63,2},{30,47},{-40,-26}}
        ));

    }
}
