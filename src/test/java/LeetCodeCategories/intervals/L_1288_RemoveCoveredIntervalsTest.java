package LeetCodeCategories.intervals;

import org.junit.Test;

import static LeetCodeCategories.intervals.L_1288_RemoveCoveredIntervals.removeCoveredIntervals;
import static org.junit.Assert.*;

public class L_1288_RemoveCoveredIntervalsTest {

    @Test
    public void firstTest() {
        int[][] intervals = new int[][] {{1,4},{3,6},{2,8}};
        assertEquals(2,removeCoveredIntervals(intervals));
    }

    @Test
    public void secondTest() {
        int[][] intervals = new int[][] {{1,4},{2,3}};
        assertEquals(1,removeCoveredIntervals(intervals));
    }

    @Test
    public void thirdTest() {
        int[][] intervals = new int[][] {{3,10},{4,10}, {5,11}};
        assertEquals(2,removeCoveredIntervals(intervals));
    }

    @Test
    public void forthTest() {
        int[][] intervals = new int[][] {{1,2},{1,4}, {3,4}};
        assertEquals(1,removeCoveredIntervals(intervals));
    }

}