package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L58LengthLastWordTest {

    L58LengthLastWord myClass;

    @BeforeEach
    void setUp() {
        myClass = new L58LengthLastWord();
    }

    @Test
    public void testFirst() {
        assertEquals(5, myClass.lengthOfLastWord("Hello World"));
    }

    @Test
    public void testSecond() {
        assertEquals(4, myClass.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    public void testThird() {
        assertEquals(6, myClass.lengthOfLastWord("luffy is still joyboy"));
    }


}