package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1456MaximumNumberVowelsSubstringGivenLengthTest {

    L1456MaximumNumberVowelsSubstringGivenLength myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1456MaximumNumberVowelsSubstringGivenLength();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.maxVowels("abciiidef", 3);
        //Then
        assertEquals(3, actual);
    }

}