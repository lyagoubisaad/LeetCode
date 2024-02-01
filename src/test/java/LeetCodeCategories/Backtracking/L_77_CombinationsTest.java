package LeetCodeCategories.Backtracking;

import org.junit.Test;

import java.util.List;

import static LeetCodeCategories.Backtracking.L_77_Combinations.combine;
import static org.junit.Assert.assertEquals;

public class L_77_CombinationsTest {

    @Test
    public void firstTest() {
        int n= 4;
        int k= 3;
        List<List<Integer>> list1 = List.of(List.of(1, 2, 3), List.of(1, 2, 4), List.of(1, 3, 4), List.of(2, 3, 4));
        assertEquals(list1, combine(n,k));
    }

    @Test
    public void secondTest() {
        int n= 1;
        int k= 1;
        List<List<Integer>> list1 = List.of(List.of(1));
        assertEquals(list1, combine(n,k));
    }

    @Test
    public void thirdTest() {
        int n= 4;
        int k= 2;
        List<List<Integer>> list1 = List.of(List.of(1, 2), List.of(1, 3), List.of(1, 4), List.of(2, 3), List.of(2, 4), List.of(3, 4));
        assertEquals(list1, combine(n,k));
    }
}