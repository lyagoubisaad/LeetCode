package leetcode_categories.graphs;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1462_CourseScheduleIVTest {

    L_1462_CourseScheduleIV myClass = new L_1462_CourseScheduleIV();

    @Test
    public void firstTest() {
        int[][] prerequisites = new int[][] {{1,0}};
        int[][] queries = new int[][] {{0,1}, {1,0}};
        assertEquals(List.of(false, true), myClass.checkIfPrerequisite(2, prerequisites, queries));
    }

    @Test
    public void secondTest() {
        int[][] prerequisites = new int[][] {{}};
        int[][] queries = new int[][] {{1,0}, {0,1}};
        assertEquals(List.of(false, false), myClass.checkIfPrerequisite(2, prerequisites, queries));
    }

    @Test
    public void thirdTest() {
        int[][] prerequisites = new int[][] {{1,2}, {2,0}};
        int[][] queries = new int[][] {{1,0}, {1,2}};
        assertEquals(List.of(true, true), myClass.checkIfPrerequisite(3, prerequisites, queries));
    }

    @Test
    public void forthTest() {
        int[][] prerequisites = new int[][] {{0,1}, {1,2}, {2,3}, {3,4}};
        int[][] queries = new int[][] {{0,4}, {4,0}, {1,3}, {3,0}};
        assertEquals(List.of(true, false, true, false), myClass.checkIfPrerequisite(5, prerequisites, queries));
    }

}