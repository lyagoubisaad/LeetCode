package leetcode_categories.intervals;

import java.util.Arrays;

public class L_1288_RemoveCoveredIntervals {
    public static int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]==b[0]? -Integer.compare(a[1],b[1]): Integer.compare(a[0],b[0]));
        int cpt = 0;
        for (int i=0;i<intervals.length;i++) {
            int j= i+1;
            while (j<intervals.length && intervals[j][1] <= intervals[i][1]) {
                j++;
                cpt++;
            }
            i = j-1;
        }
        return intervals.length-cpt;
    }
}
