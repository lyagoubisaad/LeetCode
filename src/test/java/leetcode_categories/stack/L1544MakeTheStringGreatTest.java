package leetcode_categories.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L1544MakeTheStringGreatTest {

    L1544MakeTheStringGreat myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1544MakeTheStringGreat();
    }

    @Test
    public void testFirst() {
        //When
        String actual = myClass.makeGood("leEeetcode");
        //Then
        assertEquals("leetcode", actual);
    }

}