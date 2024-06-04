package leetcode_categories.slidingwindow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L658FindKClosestElementsTest {

    L658FindKClosestElements myClass;

    @BeforeEach
    void setUp() {
        myClass = new L658FindKClosestElements();
    }

    @Test
    public void testFirst() {
        //Given
        int[] arr = new int[] {1,2,3,4,5};
        List<Integer> expected = List.of(1,2,3,4);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 4, 3);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] arr = new int[] {1,1,1,10,10,10};
        List<Integer> expected = List.of(10);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 1, 9);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] arr = new int[] {1,2,3,4,5};
        List<Integer> expected = List.of(1,2,3,4);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 4, -1);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] arr = new int[] {-2,-1,1,2,3,4,5};
        List<Integer> expected = List.of(-2,-1,1,2,3,4,5);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 7, 3);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[] arr = new int[] {1,2,2,2,5,5,5,8,9,9};
        List<Integer> expected = List.of(1, 2, 2, 2);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 4, 0);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSixth() {
        //Given
        int[] arr = new int[] {0,1,2,2,2,3,6,8,8,9};
        List<Integer> expected = List.of(3, 6, 8, 8, 9);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 5, 9);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSeventh() {
        //Given
        int[] arr = new int[] {1,3};
        List<Integer> expected = List.of(1);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 1, 2);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testEighth() {
        //Given
        int[] arr = new int[] {1,5,10};
        List<Integer> expected = List.of(5);
        //When
        List<Integer> actual = myClass.findClosestElements(arr, 1, 4);
        //Then
        assertEquals(expected, actual);
    }

}