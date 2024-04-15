package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L187RepeatedDNASequencesTest {

    L187RepeatedDNASequences myClass;

    @BeforeEach
    void setUp() {
        myClass = new L187RepeatedDNASequences();
    }

    @Test
    public void testFirst() {
        //Given
        List<String> expected = List.of("AAAAACCCCC", "CCCCCAAAAA");
        //When
        List<String> actual = myClass.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        List<String> expected = List.of("AAAAAAAAAA");
        //When
        List<String> actual = myClass.findRepeatedDnaSequences("AAAAAAAAAAAAA");
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        List<String> expected = List.of();
        //When
        List<String> actual = myClass.findRepeatedDnaSequences("A");
        //Then
        assertEquals(expected, actual);
    }

}