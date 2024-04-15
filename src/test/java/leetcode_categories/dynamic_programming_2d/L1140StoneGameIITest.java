package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1140StoneGameIITest {

    L1140StoneGameII myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1140StoneGameII();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [2,7,9,4,4]
                [1,2,3,4,5,100]
                [9,2,2,8,3,7,9,9]
                [1]
                """);
    }
    
    @Test
    public void testFirst() {
        //Given
        int[] piles = new int[] {2,7,9,4,4};
        //When
        int actual = myClass.stoneGameII(piles);
        //Then
        assertEquals(10, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] piles = new int[] {1,2,3,4,5,100};
        //When
        int actual = myClass.stoneGameII(piles);
        //Then
        assertEquals(104, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] piles = new int[] {9,2,2,8,3,7,9,9};
        //When
        int actual = myClass.stoneGameII(piles);
        //Then
        assertEquals(29, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] piles = new int[] {1};
        //When
        int actual = myClass.stoneGameII(piles);
        //Then
        assertEquals(1, actual);
    }




}