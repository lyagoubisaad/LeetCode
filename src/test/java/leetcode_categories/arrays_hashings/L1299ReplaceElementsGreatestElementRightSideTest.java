package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

public class L1299ReplaceElementsGreatestElementRightSideTest {

    L1299ReplaceElementsGreatestElementRightSide myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1299ReplaceElementsGreatestElementRightSide();
    }

    @Test
    public void testFirst() {
        //Given
        int[] arr = new int[] {17,18,5,4,6,1};
        int[] expected = new int[] {18,6,6,6,1,-1};
        //When
        int[] result = myClass.replaceElements(arr);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] arr = new int[] {400};
        int[] expected = new int[] {-1};
        //When
        int[] result = myClass.replaceElements(arr);
        //Then
        TestUtils.assertArrayEquals(expected, result);
    }

}