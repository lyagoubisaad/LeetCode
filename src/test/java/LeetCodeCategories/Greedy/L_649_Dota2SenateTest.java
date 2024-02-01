package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_649_Dota2Senate.predictPartyVictory;
import static org.junit.Assert.assertEquals;

public class L_649_Dota2SenateTest {
    @Test
    public void firstTest() {
        String input = "RD";
        assertEquals("Radiant", predictPartyVictory(input));
    }

    @Test
    public void secondTest() {
        String input = "RDD";
        assertEquals("Dire", predictPartyVictory(input));
    }

    @Test
    public void thirdTest() {
        String input = "DDRRR";
        assertEquals("Dire", predictPartyVictory(input));
    }

    @Test
    public void forthTest() {
        String input = "DDRRRR";
        assertEquals("Radiant", predictPartyVictory(input));
    }
}