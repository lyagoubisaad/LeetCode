package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import static org.junit.jupiter.api.Assertions.*;

public class L_1049_Last_Stone_Weight_IITest {

    L_1049_Last_Stone_Weight_II myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_1049_Last_Stone_Weight_II();
        convertor = new Convertor();

    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("[2,7,4,1,8,1]");
        convertor.convert("[31,26,33,21,40]");
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