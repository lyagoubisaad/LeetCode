package LeetCodeCategories.Graphs;

import org.junit.Test;

import java.util.List;

import static Utils.TestUtils.assertArrayEquals;

public class L_399_EvaluateDivisionTest {

    L_399_EvaluateDivision myClass = new L_399_EvaluateDivision();

    @Test
    public void firstTest() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"));
        double[] values = new double[] {2.0, 3.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("b", "a"), List.of("a", "e"), List.of("a", "a"), List.of("x", "x"));
        assertArrayEquals(new double[] {6.00000,0.50000,-1.00000,1.00000,-1.00000}, myClass.calcEquation(equations, values, queries));
    }

    @Test
    public void secondTest() {
        List<List<String>> equations = List.of(List.of("a", "b"), List.of("b", "c"), List.of("bc", "cd"));
        double[] values = new double[] {1.5, 2.5, 5.0};
        List<List<String>> queries = List.of(List.of("a", "c"), List.of("c", "b"), List.of("bc", "cd"), List.of("cd", "bc"));
        assertArrayEquals(new double[] {3.75000,0.40000,5.00000,0.20000}, myClass.calcEquation(equations, values, queries));
    }

    @Test
    public void thirdTest() {
        List<List<String>> equations = List.of(List.of("a", "b"));
        double[] values = new double[] {0.5};
        List<List<String>> queries = List.of(List.of("a", "b"), List.of("b", "a"), List.of("a", "c"), List.of("x", "y"));
        assertArrayEquals(new double[] {0.50000,2.00000,-1.00000,-1.00000}, myClass.calcEquation(equations, values, queries));
    }

    @Test
    public void forthTest() {
        List<List<String>> equations = List.of(List.of("x1", "x2"),List.of("x2", "x3"),List.of("x3", "x4"),List.of("x4", "x5"));
        double[] values = new double[] {3.0,4.0,5.0,6.0};
        List<List<String>> queries = List.of(List.of("x1", "x5"), List.of("x5", "x2"), List.of("x2", "x4"), List.of("x2", "x2"), List.of("x2", "x9"), List.of("x9", "x9"));
        assertArrayEquals(new double[] {360.00000,0.008333333333333333,20.00000,1.00000,-1.00000,-1.00000}, myClass.calcEquation(equations, values, queries));
    }

}