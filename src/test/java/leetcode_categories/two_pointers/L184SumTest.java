package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L184SumTest {

    L184Sum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L184Sum();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> expected = List.of(List.of(-2,-1,1,2), List.of(-2,0,0,2), List.of(-1,0,0,1));
        //When
        List<List<Integer>> actual = myClass.fourSum(nums, target);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {2,2,2,2,2};
        int target = 8;
        List<List<Integer>> expected = List.of(List.of(2,2,2,2));
        //When
        List<List<Integer>> actual = myClass.fourSum(nums, target);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {1000000000,1000000000,1000000000,1000000000};
        int target = -294967296;
        List<List<Integer>> expected = List.of();
        //When
        List<List<Integer>> actual = myClass.fourSum(nums, target);
        //Then
        assertEquals(expected, actual);
    }

}