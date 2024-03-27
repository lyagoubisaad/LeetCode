package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import static LeetCodeCategories.ArrayAndHashings.L_2002_MaximumProductOfTheLengthOfTwoPalindromicSubsequences.maxProduct;
import static org.junit.Assert.assertEquals;

public class L_2002_MaximumProductOfTheLengthOfTwoPalindromicSubsequencesTest {

    @Test
    public void firstTest() {
        assertEquals(1, maxProduct("bb"));
    }

    @Test
    public void secondTest() {
        assertEquals(9, maxProduct("leetcodecom"));
    }

    @Test
    public void thirdTest() {
        assertEquals(25, maxProduct("accbcaxxcxx"));
    }

}