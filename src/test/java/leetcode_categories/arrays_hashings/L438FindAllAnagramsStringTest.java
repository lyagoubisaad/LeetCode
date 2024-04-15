package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L438FindAllAnagramsStringTest {

    L438FindAllAnagramsString myClass;

    @BeforeEach
    void setUp() {
        myClass = new L438FindAllAnagramsString();
    }

    @Test
    public void testFirst() {
        //Given
        List<Integer> expected = List.of(0,6);
        //When
        List<Integer> actual = myClass.findAnagrams("cbaebabacd","abc");
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        List<Integer> expected = List.of(0,1,2);
        //When
        List<Integer> actual = myClass.findAnagrams("abab","ab");
        //Then
        assertEquals(expected, actual);
    }

}