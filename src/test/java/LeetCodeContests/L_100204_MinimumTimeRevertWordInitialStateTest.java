package LeetCodeContests;

import org.junit.Test;

import static LeetCodeContests.L_100204_MinimumTimeRevertWordInitialState.minimumTimeToInitialState;
import static org.junit.jupiter.api.Assertions.*;

public class L_100204_MinimumTimeRevertWordInitialStateTest {
    @Test
    public void firstTest() {
        String word = "abacaba";
        int k=3;
        assertEquals(2, minimumTimeToInitialState(word, k));
    }

    @Test
    public void secondTest() {
        String word = "abacaba";
        int k=4;
        assertEquals(1, minimumTimeToInitialState(word, k));
    }

    @Test
    public void thirdTest() {
        String word = "abcbabcd";
        int k=2;
        assertEquals(4, minimumTimeToInitialState(word, k));
    }

    @Test
    public void forthTest() {
        String word = "ababa";
        int k=2;
        assertEquals(1, minimumTimeToInitialState(word, k));
    }

}