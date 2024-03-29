package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_1871_JumpGameVII.canReach;
import static org.junit.Assert.assertEquals;

public class L_1871_JumpGameVIITest{

    @Test
    public void firstTest() {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;
        assertEquals(true, canReach(s, minJump, maxJump));
    }

    @Test
    public void secondTest() {
        String s = "01101110";
        int minJump = 2;
        int maxJump = 3;
        assertEquals(false, canReach(s, minJump, maxJump));
    }
}