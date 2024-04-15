package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static utils.TestUtils.assertArrayEquals;

public class L_1964_FindLongestValidObstacleCourseInPositionTest {

    L_1964_FindLongestValidObstacleCourseInPosition myClass = new L_1964_FindLongestValidObstacleCourseInPosition();

    @Test
    public void firstTest() {
        int[] obstacles = new int[] {1,2,3,2,4};
        assertArrayEquals(myClass.longestObstacleCourseAtEachPosition(obstacles), new int[] {1,2,3,3,5});
    }

    @Test
    public void secondTest() {
        int[] obstacles = new int[] {2,2,1};
        assertArrayEquals(myClass.longestObstacleCourseAtEachPosition(obstacles), new int[] {1,2,1});
    }

    @Test
    public void thirdTest() {
        int[] obstacles = new int[] {3,1,5,6,4,2,7,4};
        assertArrayEquals(myClass.longestObstacleCourseAtEachPosition(obstacles), new int[] {1,1,2,3,2,2,4,3});
    }

    @Test
    public void forthTest() {
        int[] obstacles = new int[] {5,1,5,5,1,3,4,5,1,4};
        assertArrayEquals(myClass.longestObstacleCourseAtEachPosition(obstacles), new int[] {1,1,2,3,2,3,4,5,3,5});
    }

}