package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L118PascalsTriangleTest {

    L118PascalsTriangle myClass;

    @BeforeEach
    void setUp() {
        myClass = new L118PascalsTriangle();
    }

    @Test
    public void testFirst() {
        //Given
        int numRows = 5;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1),  Arrays.asList(1,1),  Arrays.asList(1,2,1),  Arrays.asList(1,3,3,1),  Arrays.asList(1,4,6,4,1));
        //When
        List<List<Integer>> actual = myClass.generate(numRows);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int numRows = 1;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1));
        //When
        List<List<Integer>> actual = myClass.generate(numRows);
        //Then
        assertEquals(expected, actual);
    }

}