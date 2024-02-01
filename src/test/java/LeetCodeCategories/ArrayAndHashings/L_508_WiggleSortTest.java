package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import static LeetCodeCategories.ArrayAndHashings.L_508_WiggleSort.wiggleSort;
import static Utils.TestUtils.assertArrayEquals;

public class L_508_WiggleSortTest {

    @Test
    public void firstTest() {
        int[] nums = new int[] {3, 5, 2, 1, 6, 4};
        int[] wiggleSortedNums = new int[] {1, 6, 2, 5, 3, 4};
        wiggleSort(nums);
        assertArrayEquals(wiggleSortedNums, nums);
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] wiggleSortedNums = new int[] {1,4,2,3};
        wiggleSort(nums);
        assertArrayEquals(wiggleSortedNums, nums);
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {1,1,1};
        int[] wiggleSortedNums = new int[] {1,1,1};
        wiggleSort(nums);
        assertArrayEquals(wiggleSortedNums, nums);
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {};
        int[] wiggleSortedNums = new int[] {};
        wiggleSort(nums);
        assertArrayEquals(wiggleSortedNums, nums);
    }

    @Test
    public void fifthTest() {
        int[] nums = new int[] {1};
        int[] wiggleSortedNums = new int[] {1};
        wiggleSort(nums);
        assertArrayEquals(wiggleSortedNums, nums);
    }
}