package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static LeetCodeCategories.ArrayAndHashings.L_659_EncodeandDecodeStrings.decode;
import static LeetCodeCategories.ArrayAndHashings.L_659_EncodeandDecodeStrings.encode;
import static org.junit.Assert.*;

public class L_659_EncodeandDecodeStringsTest {

    @Test
    public void firstTest() {
        List<String> input = new ArrayList<>(Arrays.asList("lint", "code", "love", "you"));
        assertEquals(input,decode(encode(input)) );
    }


}