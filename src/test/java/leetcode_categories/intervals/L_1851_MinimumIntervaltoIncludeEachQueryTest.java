package leetcode_categories.intervals;

import org.junit.Test;

import static leetcode_categories.intervals.L_1851_MinimumIntervaltoIncludeEachQuery.minInterval;
import static utils.TestUtils.assertArrayEquals;

public class L_1851_MinimumIntervaltoIncludeEachQueryTest {

    @Test
    public void firstTest() {
        int[][] intervals = new int[][] {{1,4},{2,4},{3,6},{4,4}};
        int[] queries = new int[] {2,3,4,5};
        assertArrayEquals(minInterval(intervals, queries), new int[] {3,3,1,4});
    }

    @Test
    public void secondTest() {
        int[][] intervals = new int[][] {{2,3},{2,5},{1,8},{20,25}};
        int[] queries = new int[] {2,19,5,22};
        assertArrayEquals(minInterval(intervals, queries), new int[] {2,-1,4,6});
    }

    @Test
    public void thirdTest() {
        int[][] intervals = new int[][] {{4,5},{5,8},{1,9},{8,10}, {1,6}};
        int[] queries = new int[] {7,9,3,9,3};
        assertArrayEquals(minInterval(intervals, queries), new int[] {4,3,6,3,6});
    }

}