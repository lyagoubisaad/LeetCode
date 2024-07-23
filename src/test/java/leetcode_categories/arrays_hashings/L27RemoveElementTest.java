package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L27RemoveElementTest {

    L27RemoveElement myClass;

    @BeforeEach
    void setUp() {
        myClass = new L27RemoveElement();
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {3,2,2,3};
        //When
        int actual = myClass.removeElement(nums, 3);
        //Then
        assertEquals(2, actual);
    }

}