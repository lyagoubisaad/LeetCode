package leetcode_contests.c_14_04_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L3114LatestTimeReplacingCharactersTest {
    L3114LatestTimeReplacingCharacters myClass;

    @BeforeEach
    void setUp() {
        myClass = new L3114LatestTimeReplacingCharacters();
    }

    @Test
    public void testFirst() {
        //When
        String actual = myClass.findLatestTime("1?:?4");
        //Then
        assertEquals("11:54", actual);
    }

    @Test
    public void testSecond() {
        //When
        String actual = myClass.findLatestTime("0?:5?");
        //Then
        assertEquals("09:59", actual);
    }
}