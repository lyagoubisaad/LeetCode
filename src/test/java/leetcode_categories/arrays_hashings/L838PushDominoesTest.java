package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L838PushDominoesTest {

    L838PushDominoes myClass;

    @BeforeEach
    void setUp() {
        myClass = new L838PushDominoes();
    }

    @Test
    public void testFirst() {
        //Given
        String dominoes = "RR.L";
        String expected = "";
        //When
        String actual = myClass.pushDominoes(dominoes);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String dominoes = ".L.R...LR..L..";
        String expected = "LL.RR.LLRRLL..";
        //When
        String actual = myClass.pushDominoes(dominoes);
        //Then
        assertEquals(expected, actual);
    }

}