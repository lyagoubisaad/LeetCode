package LeetCodeCategories.Graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_909_SnakesAndLaddersTest {

    L_909_SnakesAndLadders myclass = new L_909_SnakesAndLadders();

    @Test
    public void firstTest() {
        int[][] board = new int[][] {
                {-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,-1,-1,-1,-1,-1},{-1,35,-1,-1,13,-1},{-1,-1,-1,-1,-1,-1},{-1,15,-1,-1,-1,-1}
        };
        assertEquals(4, myclass.snakesAndLadders(board));
    }

    @Test
    public void secondTest() {
        int[][] board = new int[][] {
                {1,1,-1},{1,1,1},{-1,1,1}
        };
        assertEquals(-1, myclass.snakesAndLadders(board));
    }

    @Test
    public void thirdTest() {
        int[][] board = new int[][] {
                {-1,-1},{-1,1}
        };
        assertEquals(1, myclass.snakesAndLadders(board));
    }
}