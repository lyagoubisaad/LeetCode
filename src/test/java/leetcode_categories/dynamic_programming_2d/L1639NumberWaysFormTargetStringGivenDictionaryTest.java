package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L1639NumberWaysFormTargetStringGivenDictionaryTest {

    L1639NumberWaysFormTargetStringGivenDictionary myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1639NumberWaysFormTargetStringGivenDictionary();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("""   
                ["acca","bbbb","caca"]
                ["abba","baab"]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        String[] words = new String[] {"acca","bbbb","caca"};
        //When
        int actual = myClass.numWays(words, "aba");
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] words = new String[] {"abba","baab"};
        //When
        int actual = myClass.numWays(words, "bab");
        //Then
        assertEquals(4, actual);
    }

}