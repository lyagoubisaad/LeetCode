package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class L926FlipStringMonotoneIncreasingTest {

    L926FlipStringMonotoneIncreasing myClass;

    @BeforeEach
    void setUp() {
        myClass = new L926FlipStringMonotoneIncreasing();
    }

    @Test
    public void testFirst() {
        //Given & When
        int actual = myClass.minFlipsMonoIncr("00110");
        //Then
        Assertions.assertEquals(1, actual);
    }

    @Test
    public void testSecond() {
        //Given & When
        int actual = myClass.minFlipsMonoIncr("010110");
        //Then
        Assertions.assertEquals(2, actual);
    }


    @Test
    public void testThird() {
        //Given & When
        int actual = myClass.minFlipsMonoIncr("00011000");
        //Then
        Assertions.assertEquals(2, actual);
    }

}