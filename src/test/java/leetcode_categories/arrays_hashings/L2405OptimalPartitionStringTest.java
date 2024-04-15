package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2405OptimalPartitionStringTest {

    L2405OptimalPartitionString myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2405OptimalPartitionString();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.partitionString("abacaba");
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.partitionString("ssssss");
        //Then
        assertEquals(6, actual);
    }

}