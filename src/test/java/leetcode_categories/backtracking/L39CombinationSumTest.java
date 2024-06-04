package leetcode_categories.backtracking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L39CombinationSumTest {

    L39CombinationSum myClass;

    @BeforeEach
    void setUp() {
        myClass = new L39CombinationSum();
    }

    @Test
    public void testFirst() {
        //Given
        int[] candidates = new int[] {2,3,6,7};
        List<List<Integer>> expected = List.of(List.of(2,2,3), List.of(7));
        //When
        List<List<Integer>> result = myClass.combinationSum(candidates, 7);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] candidates = new int[] {2,3,5};
        List<List<Integer>> expected = List.of(List.of(2,2,2,2), List.of(2,3,3), List.of(3,5));
        //When
        List<List<Integer>> result = myClass.combinationSum(candidates, 8);
        //Then
        assertEquals(expected, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] candidates = new int[] {2};
        List<List<Integer>> expected = List.of();
        //When
        List<List<Integer>> result = myClass.combinationSum(candidates, 1);
        //Then
        assertEquals(expected, result);
    }

}