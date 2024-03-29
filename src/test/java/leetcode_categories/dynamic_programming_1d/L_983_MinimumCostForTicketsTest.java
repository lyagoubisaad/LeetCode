package leetcode_categories.dynamic_programming_1d;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_983_MinimumCostForTicketsTest {

    L_983_MinimumCostForTickets myClass = new L_983_MinimumCostForTickets();

    @Test
    public void firstTest() {
        int[] days = new int[] {1,4,6,7,8,20};
        int[] costs = new int[] {2,7,15};
        assertEquals(11, myClass.mincostTickets(days, costs));
    }

    @Test
    public void secondTest() {
        int[] days = new int[] {1,2,3,4,5,6,7,8,9,10,30,31};
        int[] costs = new int[] {2,7,15};
        assertEquals(17, myClass.mincostTickets(days, costs));
    }


}