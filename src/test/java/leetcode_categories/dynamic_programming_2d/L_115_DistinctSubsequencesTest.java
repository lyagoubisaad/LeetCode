package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L_115_DistinctSubsequencesTest {

    L115DistinctSubsequences myClass;

    @BeforeEach
    void setUp() {
        myClass = new L115DistinctSubsequences();
    }

    @Test
    public void testFirst() {
        //Given
        String s = "rabbbit", t = "rabbit";
        //When
        int actual = myClass.numDistinct(s,t);
        //Then
        assertEquals(3,actual);
    }

    @Test
    public void secondTest() {
        //Given
        String s = "babgbag", t = "bag";
        //When
        int actual = myClass.numDistinct(s,t);
        //Then
        assertEquals(5,actual);
    }
}