package leetcode_categories.math_geometry;

import org.junit.Test;

import static leetcode_categories.math_geometry.L_1041_RobotBoundedInCircle.isRobotBounded;
import static org.junit.Assert.assertEquals;

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