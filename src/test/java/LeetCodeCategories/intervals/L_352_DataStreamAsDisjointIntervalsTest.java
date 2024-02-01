package LeetCodeCategories.intervals;

import org.junit.Test;

public class L_352_DataStreamAsDisjointIntervalsTest {

    @Test
    public void firstTest() {
        L_352_DataStreamAsDisjointIntervals summaryRanges = new L_352_DataStreamAsDisjointIntervals();
        summaryRanges.addNum(1);      // arr = [1]
        summaryRanges.getIntervals(); // return [[1, 1]]
        summaryRanges.addNum(3);      // arr = [1, 3]
        summaryRanges.getIntervals(); // return [[1, 1], [3, 3]]
        summaryRanges.addNum(7);      // arr = [1, 3, 7]
        summaryRanges.getIntervals(); // return [[1, 1], [3, 3], [7, 7]]
        summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
        summaryRanges.getIntervals(); // return [[1, 3], [7, 7]]
        summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
        summaryRanges.getIntervals(); // return [[1, 3], [6, 7]]
    }

}