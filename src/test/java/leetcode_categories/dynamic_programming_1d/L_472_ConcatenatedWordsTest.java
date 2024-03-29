package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_472_ConcatenatedWordsTest {

    L_472_ConcatenatedWords myClass = new L_472_ConcatenatedWords();

    @Test
    public void firstTest() {
        String[] words = new String[] {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
        List<String> output = List.of("catsdogcats","dogcatsdog","ratcatdogcat");
        assertEquals(output, myClass.findAllConcatenatedWordsInADict(words));
    }

    @Test
    public void secondTest() {
        String[] words = new String[] {"cat","dog","catdog"};
        List<String> output = List.of("catdog");
        assertEquals(output, myClass.findAllConcatenatedWordsInADict(words));
    }

    @Test
    public void thirdTest() {
        String[] words = new String[] {"a","b","ab","abc"};
        List<String> output = List.of("ab");
        assertEquals(output, myClass.findAllConcatenatedWordsInADict(words));
    }

}