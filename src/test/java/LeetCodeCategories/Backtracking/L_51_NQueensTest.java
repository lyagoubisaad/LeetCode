package LeetCodeCategories.Backtracking;

import org.junit.Test;

import java.util.List;

import static LeetCodeCategories.Backtracking.L_51_NQueens.solveNQueens;
import static org.junit.Assert.assertEquals;

public class L_51_NQueensTest {
    @Test
    public void firstTest() {
        List<List<String>> result = List.of(
          List.of(".Q..", "...Q","Q...", "..Q."),
          List.of("..Q.", "Q...","...Q", ".Q..")
        );

        assertEquals(result, solveNQueens(4));
    }

}