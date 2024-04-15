package leetcode_categories.prefix_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L304RangeSumQuery2DImmutableTest {

    L304RangeSumQuery2DImmutable myClass;
    Convertor convertor;


    @BeforeEach
    void setUp() {
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
               [[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]],[2,1,4,3],[1,1,2,2],[1,2,2,4]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[][] matrix = new int[][] {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
        myClass = new L304RangeSumQuery2DImmutable(matrix);
        //Then
        assertEquals(8,  myClass.sumRegion(2,1,4,3));
        assertEquals(11,  myClass.sumRegion(1,1,2,2));
        assertEquals(12,  myClass.sumRegion(1,2,2,4));
    }

}