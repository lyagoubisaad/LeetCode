package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import static Utils.TestUtils.assertArrayEquals;

public class L_1964_FindLongestValidObstacleCourseInPositionTest {

    L_1964_FindLongestValidObstacleCourseInPosition myClass = new L_1964_FindLongestValidObstacleCourseInPosition();

    @Test
    public void firstTest() {
        int[] obstacles = new int[] {1,2,3,2};
        assertArrayEquals(new int[] {1,2,3,2}, myClass.longestObstacleCourseAtEachPosition(obstacles));
    }

    @Test
    public void secondTest() {
        int[] obstacles = new int[] {2,2,1};
        assertArrayEquals(new int[] {1,2,1}, myClass.longestObstacleCourseAtEachPosition(obstacles));
    }

    @Test
    public void thirdTest() {
        int[] obstacles = new int[] {3,1,5,6,4,2};
        assertArrayEquals(new int[] {1,1,2,3,2,2}, myClass.longestObstacleCourseAtEachPosition(obstacles));
    }

}