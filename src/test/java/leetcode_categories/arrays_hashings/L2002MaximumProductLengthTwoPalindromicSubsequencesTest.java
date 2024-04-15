package leetcode_categories.arrays_hashings;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class L2002MaximumProductLengthTwoPalindromicSubsequencesTest {

    L2002MaximumProductLengthTwoPalindromicSubsequences myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2002MaximumProductLengthTwoPalindromicSubsequences();
    }

    @Test
    public void firstTest() {
        assertEquals(1, myClass.maxProduct("bb"));
    }

    @Test
    public void secondTest() {
        assertEquals(9, myClass.maxProduct("leetcodecom"));
    }

    @Test
    public void thirdTest() {
        assertEquals(25, myClass.maxProduct("accbcaxxcxx"));
    }

}