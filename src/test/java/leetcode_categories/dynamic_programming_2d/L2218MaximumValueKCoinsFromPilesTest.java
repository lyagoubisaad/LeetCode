package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L2218MaximumValueKCoinsFromPilesTest {

    L2218MaximumValueKCoinsFromPiles myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2218MaximumValueKCoinsFromPiles();
    }

    @Test
    public void testFirst() {
        //Given
        List<List<Integer>> piles= List.of(
                List.of(1,100,3), List.of(7,8,9)
        );
        //When
        int actual = myClass.maxValueOfCoins(piles, 2);
        //Then
        assertEquals(101, actual);
    }

    @Test
    public void testSecond() {
        //Given
        List<List<Integer>> piles= List.of(
                List.of(100), List.of(100), List.of(100), List.of(100), List.of(100), List.of(100),
                List.of(1,1,1,1,1,1,700)
        );
        //When
        int actual = myClass.maxValueOfCoins(piles, 7);
        //Then
        assertEquals(706, actual);
    }

}