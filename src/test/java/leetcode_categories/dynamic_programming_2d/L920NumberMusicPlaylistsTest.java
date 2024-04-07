package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L920NumberMusicPlaylistsTest {

    L920NumberMusicPlaylists myClass;

    @BeforeEach
    void setUp() {
        myClass = new L920NumberMusicPlaylists();
    }

    @Test
    public void testFirst() {
        //Given & When
        int actual = myClass.numMusicPlaylists(3,3,1);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testSecond() {
        //Given & When
        int actual = myClass.numMusicPlaylists(2,3,0);
        //Then
        assertEquals(6, actual);
    }

    @Test
    public void testThird() {
        //Given & When
        int actual = myClass.numMusicPlaylists(2,3,1);
        //Then
        assertEquals(2, actual);
    }

}