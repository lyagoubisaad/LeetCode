package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1930UniqueLength3PalindromicSubsequencesTest {

    L1930UniqueLength3PalindromicSubsequences myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1930UniqueLength3PalindromicSubsequences();
    }

    @Test
    public void testFirst() {
        //When
        int actual = myClass.countPalindromicSubsequence("aabca");
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testSecond() {
        //When
        int actual = myClass.countPalindromicSubsequence("adc");
        //Then
        assertEquals(0, actual);
    }

    @Test
    public void testThird() {
        //When
        int actual = myClass.countPalindromicSubsequence("bbcbaba");
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testForth() {
        //When
        int actual = myClass.countPalindromicSubsequence("uuuuu");
        //Then
        assertEquals(1, actual);
    }

    @Test
    public void testFifth() {
        //When
        int actual = myClass.countPalindromicSubsequence("tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp");
        //Then
        assertEquals(161, actual);
    }


}