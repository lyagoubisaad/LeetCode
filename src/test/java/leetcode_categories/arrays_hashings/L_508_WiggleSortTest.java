package leetcode_categories.arrays_hashings;

import org.junit.Test;

import static utils.TestUtils.assertArrayEquals;

public class L_508_WiggleSortTest {

    L_508_WiggleSort myClass = new L_508_WiggleSort();

    @Test
    public void firstTest() {
        int[] nums = new int[] {3, 5, 2, 1, 6, 4};
        int[] wiggleSortedNums = new int[] {1, 6, 2, 5, 3, 4};
        myClass.wiggleSort(nums);
        assertArrayEquals(nums, wiggleSortedNums);
    }

    @Test
    public void secondTest() {
        int[] nums = new int[] {1, 2, 3, 4};
        int[] wiggleSortedNums = new int[] {1,4,2,3};
        myClass.wiggleSort(nums);
        assertArrayEquals(nums, wiggleSortedNums);
    }

    @Test
    public void thirdTest() {
        int[] nums = new int[] {1,1,1};
        int[] wiggleSortedNums = new int[] {1,1,1};
        myClass.wiggleSort(nums);
        assertArrayEquals(nums, wiggleSortedNums);
    }

    @Test
    public void forthTest() {
        int[] nums = new int[] {};
        int[] wiggleSortedNums = new int[] {};
        myClass.wiggleSort(nums);
        assertArrayEquals(nums, wiggleSortedNums);
    }

    @Test
    public void fifthTest() {
        int[] nums = new int[] {1};
        int[] wiggleSortedNums = new int[] {1};
        myClass.wiggleSort(nums);
        assertArrayEquals(nums, wiggleSortedNums);
    }
}