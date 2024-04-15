package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1049LastStoneWeightIITest {

    L1049LastStoneWeightII myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1049LastStoneWeightII();
        convertor = new Convertor();

    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[2,7,4,1,8,1]");
        convertor.toBracesAndSingleQuotes("[31,26,33,21,40]");
    }

    @Test
    public void testFirst() {
        //Given
        int[] stones = new int[] {2,7,4,1,8,1};
        //When
        int actual = myClass.lastStoneWeightII(stones);
        //Then
        assertEquals(1,actual);
    }

    @Test
    public void secondTest() {
        //Given
        int[] stones = new int[] {31,26,33,21,40};
        //When
        int actual = myClass.lastStoneWeightII(stones);
        //Then
        assertEquals(5,actual);
    }

}