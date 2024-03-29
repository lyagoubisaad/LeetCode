package leetcode_categories.graphs;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_127_WordLadderTest {
    
    L_127_WordLadder myClass = new L_127_WordLadder();
    
    @Test
    public void firstTest() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot","dot","dog","lot","log","cog");
        assertEquals(5,myClass.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void secondTest() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot","dot","dog","lot","log");
        assertEquals(0,myClass.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void thirdTest() {
        String beginWord = "hot";
        String endWord = "dog";
        List<String> wordList = List.of("hot","dog");
        assertEquals(0,myClass.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void forthTest() {
        String beginWord = "talk";
        String endWord = "tail";
        List<String> wordList = List.of("talk","tons","fall","tail","gale","hall","negs");
        assertEquals(0,myClass.ladderLength(beginWord, endWord, wordList));
    }

    @Test
    public void fifthTest() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot","dot","tog","cog");
        assertEquals(0,myClass.ladderLength(beginWord, endWord, wordList));
    }

}