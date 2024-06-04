package leetcode_categories.graphs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

public class L1992FindAllGroupsFarmlandTest {

    L1992FindAllGroupsFarmland myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1992FindAllGroupsFarmland();
    }

    @Test
    public void testFirst() {
        //Given
        int[][] land = new int[][] {{1,0,0}, {0,1,1}, {0,1,1}};
        int[][] expected = new int[][] {{0,0,0,0}, {1,1,2,2}};
        //When
        int[][] actual = myClass.findFarmland(land);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }

}