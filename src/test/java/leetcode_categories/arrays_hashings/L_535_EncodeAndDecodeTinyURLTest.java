package leetcode_categories.arrays_hashings;

import org.junit.Test;

import static leetcode_categories.arrays_hashings.L_535_EncodeAndDecodeTinyURL.decode;
import static leetcode_categories.arrays_hashings.L_535_EncodeAndDecodeTinyURL.encode;
import static org.junit.Assert.assertEquals;

public class L_535_EncodeAndDecodeTinyURLTest {
    @Test
    public void firstTest() {
        String input = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(input, decode(encode(input)));
    }
}
