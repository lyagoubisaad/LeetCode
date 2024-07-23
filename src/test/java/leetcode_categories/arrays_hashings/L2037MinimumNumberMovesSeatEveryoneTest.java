package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2037MinimumNumberMovesSeatEveryoneTest {

    L2037MinimumNumberMovesSeatEveryone myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2037MinimumNumberMovesSeatEveryone();
    }

    @Test
    public void testFirst() {
        //Given
        int[] seats = new int[] {3,1,5};
        int[] students = new int[] {2,7,4};
        //When
        int result = myClass.minMovesToSeat(seats, students);
        //Then
        assertEquals(4, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[] seats = new int[] {4,1,5,9};
        int[] students = new int[] {1,3,2,6};
        //When
        int result = myClass.minMovesToSeat(seats, students);
        //Then
        assertEquals(7, result);
    }

    @Test
    public void testThird() {
        //Given
        int[] seats = new int[] {2,2,6,6};
        int[] students = new int[] {1,3,2,6};
        //When
        int result = myClass.minMovesToSeat(seats, students);
        //Then
        assertEquals(4, result);
    }

}