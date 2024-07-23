package leetcode_categories.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L207CourseScheduleTest {

    L207CourseSchedule myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L207CourseSchedule();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [[1,0],[1,2],[0,1]]                              
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int numsCourses = 2;
        int[][] prerequisites = new int[][] {{1,0}};
        //When & Then
        assertTrue(myClass.canFinish(numsCourses, prerequisites));
    }

    @Test
    public void testSecond() {
        //Given
        int numsCourses = 2;
        int[][] prerequisites = new int[][] {{1,0}, {0,1}};
        //When & Then
        assertFalse(myClass.canFinish(numsCourses, prerequisites));
    }

    @Test
    public void testThird() {
        //Given
        int numsCourses = 3;
        int[][] prerequisites = new int[][] {{1,0},{1,2},{0,1}};
        //When & Then
        assertFalse(myClass.canFinish(numsCourses, prerequisites));
    }

}