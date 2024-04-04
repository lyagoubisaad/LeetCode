package leetcode_categories.advanced_graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.*;

public class L_778_SwimRisingWaterTest {

    L_778_SwimRisingWater myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_778_SwimRisingWater();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("[[0,2],[1,3]]");
        convertor.convert("[[0,1,2,3,4],[24,23,22,21,5],[12,13,14,15,16],[11,17,18,19,20],[10,9,8,7,6]]");
        convertor.convert("[[3,2],[0,1]]");
    }

    @Test
    public void testFirst() {
        //Given
        int[][] grid = new int[][] {{0,2},{1,3}};
        //When
        int result = myClass.swimInWater(grid);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void testSecond() {
        //Given
        int[][] grid = new int[][] {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        //When
        int result = myClass.swimInWater(grid);
        //Then
        assertEquals(16, result);
    }

    @Test
    public void testThird() {
        //Given
        int[][] grid = new int[][] {{3,2},{0,1}};
        //When
        int result = myClass.swimInWater(grid);
        //Then
        assertEquals(3, result);
    }





}