package leetcode_categories.advanced_graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_787_CheapestFlightsWithinKStopsTest {

    L_787_CheapestFlightsWithinKStops myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_787_CheapestFlightsWithinKStops();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("[[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]]");
        convertor.convert("[[0,1,100],[1,2,100],[0,2,500]]");
        convertor.convert("[[0,1,100],[1,2,100],[0,2,500]]");
        convertor.convert("[[0,3,3],[3,4,3],[4,1,3],[0,5,1],[5,1,100],[0,6,2],[6,1,100],[0,7,1],[7,8,1],[8,9,1],[9,1,1],[1,10,1],[10,2,1],[1,2,100]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] flights = new int[][] {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        //When
        int result = myClass.findCheapestPrice(4,flights,0,3,1);
        //Then
        assertEquals(700,result);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] flights = new int[][] {{0,1,100},{1,2,100},{0,2,500}};
        //When
        int result = myClass.findCheapestPrice(3,flights,0,2,1);
        //Then
        assertEquals(200,result);
    }

    @Test
    public void testThird() {
        //Given
        int[][] flights = new int[][] {{0,1,100},{1,2,100},{0,2,500}};
        //When
        int result = myClass.findCheapestPrice(3,flights,0,2,0);
        //Then
        assertEquals(500,result);
    }

    @Test
    public void testForth() {
        //Given
        int[][] flights = new int[][] {{0,3,3},{3,4,3},{4,1,3},{0,5,1},{5,1,100},{0,6,2},{6,1,100},{0,7,1},{7,8,1},{8,9,1},{9,1,1},{1,10,1},{10,2,1},{1,2,100}};
        //When
        int result = myClass.findCheapestPrice(11,flights,0,2,4);
        //Then
        assertEquals(11,result);
    }


}