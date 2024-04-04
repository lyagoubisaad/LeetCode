package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_312_BurstBalloonsTest {

    L_312_BurstBalloons myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_312_BurstBalloons();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("""   
                [3,1,5,8]
                [1,5]
                [2,3,7,9,1,8,2]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] nums = new int[] {3,1,5,8};
        //When
        int actual = myClass.maxCoins(nums);
        //Then
        assertEquals(167, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] nums = new int[] {1,5};
        //When
        int actual = myClass.maxCoins(nums);
        //Then

        assertEquals(10, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] nums = new int[] {2,3,7,9,1,8,2};
        //When
        int actual = myClass.maxCoins(nums);
        //Then
        assertEquals(832, actual);
    }

}