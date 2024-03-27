package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import static LeetCodeCategories.ArrayAndHashings.L_535_EncodeAndDecodeTinyURL.decode;
import static LeetCodeCategories.ArrayAndHashings.L_535_EncodeAndDecodeTinyURL.encode;
import static org.junit.Assert.assertEquals;

public class L_535_EncodeAndDecodeTinyURLTest {
    @Test
    public void firstTest() {
        String input = "https://leetcode.com/problems/design-tinyurl";
        assertEquals(input, decode(encode(input)));
    }
}
