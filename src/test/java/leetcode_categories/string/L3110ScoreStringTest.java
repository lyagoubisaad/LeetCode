package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L3110ScoreStringTest {

    L3110ScoreString myClass;

    @BeforeEach
    void setUp() {
        myClass = new L3110ScoreString();
    }

    @Test
    public void testFirst() {
        assertEquals(13, myClass.scoreOfString("hello"));
    }

    @Test
    public void testSecond() {
        assertEquals(50, myClass.scoreOfString("zaz"));
    }

}