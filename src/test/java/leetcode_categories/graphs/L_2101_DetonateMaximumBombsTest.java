package leetcode_categories.graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_2101_DetonateMaximumBombsTest {

    L_2101_DetonateMaximumBombs myClass = new L_2101_DetonateMaximumBombs();

    @Test
    public void firstTest() {
        int[][] bombs = new int[][] {{2,1,3}, {6,1,4}};
        assertEquals(2, myClass.maximumDetonation(bombs));
    }

    @Test
    public void secondTest() {
        int[][] bombs = new int[][] {{1,1,5}, {10,10,5}};
        assertEquals(1, myClass.maximumDetonation(bombs));
    }

    @Test
    public void thirdTest() {
        int[][] bombs = new int[][] {{1,2,3}, {2,3,1}, {3,4,2}, {4,5,3}, {5,6,4}};
        assertEquals(5, myClass.maximumDetonation(bombs));
    }

    @Test
    public void forthTest() {
        int[][] bombs = new int[][] {{54,95,4},{99,46,3},{29,21,3},{96,72,8},{49,43,3},{11,20,3},{2,57,1},{69,51,7},{97,1,10},{85,45,2},{38,47,1},{83,75,3},{65,59,3},{33,4,1},{32,10,2},{20,97,8},{35,37,3}};
        assertEquals(1, myClass.maximumDetonation(bombs));
    }

    @Test
    public void fifthTest() {
        int[][] bombs = new int[][] {{656,619,56},{189,402,178},{513,373,276},{900,510,14},{188,173,129},{512,178,251},{145,685,47},{504,355,500},{554,131,214},{596,1,98},{358,230,197},{88,758,155},{72,340,419},{818,708,222}};
        assertEquals(14, myClass.maximumDetonation(bombs));
    }
}