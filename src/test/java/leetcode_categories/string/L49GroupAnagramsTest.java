package leetcode_categories.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L49GroupAnagramsTest {

    L49GroupAnagrams myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L49GroupAnagrams();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                ["eat","tea","tan","ate","nat","bat"]
                [""]
                ["a"]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = Arrays.asList(
                Arrays.asList("eat", "tea", "ate"),
                Arrays.asList("tan", "nat"),
                List.of("bat")
        );
        //When
        List<List<String>> actual = myClass.groupAnagrams(strs);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] strs = new String[] {""};
        List<List<String>> expected = List.of(List.of(""));
        //When
        List<List<String>> actual = myClass.groupAnagrams(strs);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        String[] strs = new String[] {"a"};
        List<List<String>> expected = List.of(List.of("a"));
        //When
        List<List<String>> actual = myClass.groupAnagrams(strs);
        //Then
        assertEquals(expected, actual);
    }

}