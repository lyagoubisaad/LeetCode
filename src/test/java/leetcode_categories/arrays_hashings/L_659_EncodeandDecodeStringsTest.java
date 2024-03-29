package leetcode_categories.arrays_hashings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static leetcode_categories.arrays_hashings.L_659_EncodeandDecodeStrings.decode;
import static leetcode_categories.arrays_hashings.L_659_EncodeandDecodeStrings.encode;
import static org.junit.Assert.assertEquals;

public class L_659_EncodeandDecodeStringsTest {

    @Test
    public void firstTest() {
        List<String> input = new ArrayList<>(Arrays.asList("lint", "code", "love", "you"));
        assertEquals(input,decode(encode(input)) );
    }


}