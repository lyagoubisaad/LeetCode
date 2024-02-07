package LeetCodeContests;

import org.junit.Test;

import static LeetCodeContests.L_100189_FindtheGridRegionAverage.resultGrid;
import static org.junit.jupiter.api.Assertions.*;

public class L_100189_FindtheGridRegionAverageTest {

    @Test
    public void firstTest() {
        int[][] images = new int[][] {{5,6,7,10}, {8,9,10,10}, {11,12,13,10}};
        int threshold = 3;
        assertEquals(new int[][] {{9,9,9,9}, {9,9,9,9}, {9,9,9,9}}, resultGrid(images, threshold));
    }
}