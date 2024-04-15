package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2073TimeNeededBuyTicketsTest {

    L2073TimeNeededBuyTickets myClass;

    @BeforeEach
    void setUp() {
        myClass = new L2073TimeNeededBuyTickets();
    }

    @Test
    public void testFirst() {
        //Given
        int[] tickets = new int[] {5,1,1,1};
        //When
        int actual = myClass.timeRequiredToBuy(tickets, 0);
        //Then
        assertEquals(8, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] tickets = new int[] {2,3,2};
        //When
        int actual = myClass.timeRequiredToBuy(tickets, 2);
        //Then
        assertEquals(6, actual);
    }


}