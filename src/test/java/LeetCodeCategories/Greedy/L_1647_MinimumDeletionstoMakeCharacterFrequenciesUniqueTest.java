package LeetCodeCategories.Greedy;

import org.junit.Test;

import static LeetCodeCategories.Greedy.L_1647_MinimumDeletionstoMakeCharacterFrequenciesUnique.minDeletions;
import static org.junit.Assert.assertEquals;

public class L_1647_MinimumDeletionstoMakeCharacterFrequenciesUniqueTest {

    @Test
    public void firstTest() {
        String s = "aab";
        assertEquals(0,minDeletions(s));
    }

    @Test
    public void secondTest() {
        String s = "aaabbbcc";
        assertEquals(2,minDeletions(s));
    }

    @Test
    public void thirdTest() {
        String s = "ceabaacb";
        assertEquals(2,minDeletions(s));
    }

    @Test
    public void forthTest() {
        String s = "abcabc";
        assertEquals(3,minDeletions(s));
    }

    @Test
    public void fifthTest() {
        String s = "ee";
        assertEquals(0,minDeletions(s));
    }

    @Test
    public void sixthTest() {
        String s = "bbcebab";
        assertEquals(2,minDeletions(s));
    }

    @Test
    public void seventhTest() {
        String s = "accdcdadddbaadbc";
        assertEquals(1,minDeletions(s));
    }


}