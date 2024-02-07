package LeetCodeCategories.Backtracking;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L_52_NQueensIITest {

    L_52_NQueensII myClass = new L_52_NQueensII();

    @Test
    public void firstTest() {
        assertEquals(2, myClass.totalNQueens(4));
    }

    @Test
    public void secondTest() {
        assertEquals(1, myClass.totalNQueens(1));
    }
}