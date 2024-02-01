package LeetCodeCategories.Math_Geometry;

import org.junit.Test;

import static LeetCodeCategories.Math_Geometry.L_1041_RobotBoundedInCircle.isRobotBounded;
import static org.junit.Assert.*;

public class L_1041_RobotBoundedInCircleTest {
    @Test
    public void firstTest() {
        String instructions = "GGLLGG";
        assertEquals(true,isRobotBounded(instructions));
    }

    @Test
    public void secondTest() {
        String instructions = "GG";
        assertEquals(false,isRobotBounded(instructions));
    }

    @Test
    public void thirdTest() {
        String instructions = "GL";
        assertEquals(true,isRobotBounded(instructions));
    }
}