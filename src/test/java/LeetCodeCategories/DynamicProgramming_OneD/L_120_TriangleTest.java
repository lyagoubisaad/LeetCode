package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L_120_TriangleTest {

    L_120_Triangle myClass = new L_120_Triangle();

    @Test
    public void firstTest() {
        List<List<Integer>> triangle = List.of(List.of(2), List.of(3,4),List.of(6,5,7),List.of(4,1,8,3));
        assertEquals(11, myClass.minimumTotal(triangle));
    }

    @Test
    public void secondTest() {
        List<List<Integer>> triangle = List.of(List.of(-10));
        assertEquals(-10, myClass.minimumTotal(triangle));
    }

    @Test
    public void thirdTest() {
        List<List<Integer>> triangle = List.of(List.of(-1), List.of(-2, -3));
        assertEquals(-4, myClass.minimumTotal(triangle));
    }

    @Test
    public void forthTest() {
        List<List<Integer>> triangle = List.of(List.of(-1), List.of(3,2), List.of(1,-2,-1));
        assertEquals(-1, myClass.minimumTotal(triangle));
    }

}