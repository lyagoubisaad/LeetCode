package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static org.junit.Assert.*;

public class L_2013_DetectSquaresTest {
    @Test
    public void firstTest() {
        L_2013_DetectSquares board = new L_2013_DetectSquares();
        board.add(new int[] {3,10});
        board.add(new int[] {11,2});
        board.add(new int[] {3,2});
        assertEquals(1, board.count(new int[] {11,10}));
        assertEquals(0, board.count(new int[] {14,8}));
        board.add(new int[] {11,2});
        assertEquals(2, board.count(new int[] {11,10}));
    }
}