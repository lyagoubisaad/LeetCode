package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L68TextJustificationTest {

    L68TextJustification myClass;

    @BeforeEach
    void setUp() {
        myClass = new L68TextJustification();
    }

    @Test
    public void testFirst() {
        //Given
        String[] words = new String[] {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = List.of("This    is    an",
                "example  of text",
                "justification.  ");
        //When
        List<String> actual = myClass.fullJustify(words, maxWidth);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] words = new String[] {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> expected = List.of("What   must   be",
                "acknowledgment  ",
                "shall be        ");
        //When
        List<String> actual = myClass.fullJustify(words, maxWidth);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        String[] words = new String[] {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        List<String> expected = List.of("Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  ");
        //When
        List<String> actual = myClass.fullJustify(words, maxWidth);
        //Then
        assertEquals(expected, actual);
    }

}