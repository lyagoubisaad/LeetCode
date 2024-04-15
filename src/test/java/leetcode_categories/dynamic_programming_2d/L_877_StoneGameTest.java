package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L_877_StoneGameTest {

    L877StoneGame myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L877StoneGame();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("[5,3,4,5]\n" +
                "[3,7,2,3]");
    }

    @Test
    public void testFirst() {
        //Given
        int[] piles = new int[] {5,3,4,5};
        //When
        boolean actual = myClass.stoneGame(piles);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] piles = new int[] {3,7,2,3};
        //When
        boolean actual = myClass.stoneGame(piles);
        //Then
        assertTrue(actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] piles = new int[] {1, 3, 1, 5, 2};
        //When
        boolean actual = myClass.stoneGame(piles);
        //Then
        assertFalse(actual);
    }
}