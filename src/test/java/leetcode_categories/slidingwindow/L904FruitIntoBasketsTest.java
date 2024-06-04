package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L904FruitIntoBasketsTest {

    L904FruitIntoBaskets myClass;

    @BeforeEach
    void setUp() {
        myClass = new L904FruitIntoBaskets();
    }

    @Test
    public void testFirst() {
        //Given
        int[] fruits = new int[] {1,2,1};
        //When
        int actual = myClass.totalFruit(fruits);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] fruits = new int[] {0,1,2,2};
        //When
        int actual = myClass.totalFruit(fruits);
        //Then
        assertEquals(3, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] fruits = new int[] {1,2,3,2,2};
        //When
        int actual = myClass.totalFruit(fruits);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] fruits = new int[] {3,3,3,1,2,1,1,2,3,3,4};
        //When
        int actual = myClass.totalFruit(fruits);
        //Then
        assertEquals(5, actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[] fruits = new int[] {0,1,0,2};
        //When
        int actual = myClass.totalFruit(fruits);
        //Then
        assertEquals(3, actual);
    }


}