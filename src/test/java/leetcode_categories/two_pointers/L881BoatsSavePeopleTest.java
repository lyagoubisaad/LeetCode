package leetcode_categories.two_pointers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L881BoatsSavePeopleTest {

    L881BoatsSavePeople myClass;

    @BeforeEach
    void setUp() {
        myClass = new L881BoatsSavePeople();
    }

    @Test
    public void testFirst() {
        //Given
        int[] people = new int[] {1,2};
        //When
        int actual = myClass.numRescueBoats(people, 3);
        //Then
        assertEquals(1,actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] people = new int[] {3,2,2,1};
        //When
        int actual = myClass.numRescueBoats(people, 3);
        //Then
        assertEquals(3,actual);
    }

    @Test
    public void testThird() {
        //Given
        int[] people = new int[] {3,5,3,4};
        //When
        int actual = myClass.numRescueBoats(people, 5);
        //Then
        assertEquals(4,actual);
    }

    @Test
    public void testForth() {
        //Given
        int[] people = new int[] {5,1,4,2};
        //When
        int actual = myClass.numRescueBoats(people, 6);
        //Then
        assertEquals(2,actual);
    }

    @Test
    public void testFifth() {
        //Given
        int[] people = new int[] {2,2};
        //When
        int actual = myClass.numRescueBoats(people, 6);
        //Then
        assertEquals(1,actual);
    }

    @Test
    public void testSixth() {
        //Given
        int[] people = new int[] {1,5,3,5};
        //When
        int actual = myClass.numRescueBoats(people, 7);
        //Then
        assertEquals(3,actual);
    }


    @Test
    public void testSeventh() {
        //Given
        int[] people = new int[] {44,10,29,12,49,41,23,5,17,26};
        //When
        int actual = myClass.numRescueBoats(people, 50);
        //Then
        assertEquals(6,actual);
    }

}