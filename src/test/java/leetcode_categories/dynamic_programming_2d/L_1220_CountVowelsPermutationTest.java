package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1220_CountVowelsPermutationTest {

    L1220CountVowelsPermutation myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1220CountVowelsPermutation();
    }

    @Test
    public void testFirst() {
        //Given

        //When
        int actual = myClass.countVowelPermutation(1);
        //Then
        assertEquals(5,actual);
    }

    @Test
    public void testSecond() {
        //Given

        //When
        int actual = myClass.countVowelPermutation(2);
        //Then
        assertEquals(10,actual);
    }

    @Test
    public void testThird() {
        //Given

        //When
        int actual = myClass.countVowelPermutation(5);
        //Then
        assertEquals(68,actual);
    }

    @Test
    public void testForth() {
        //Given

        //When
        int actual = myClass.countVowelPermutation(144);
        //Then
        assertEquals(18208803,actual);
    }

}