package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import utils.TestUtils;

public class L347TopKFrequentElementsTest {

    L347TopKFrequentElements myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L347TopKFrequentElements();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,1,1,2,2,3]
                [1]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] expected = new int[] {1,2};
        //When
        int[] actual = myClass.topKFrequent(new int[] {1,1,1,2,2,3}, 2);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }

    @Test
    public void testSecond() {
        //Given
        int[] expected = new int[] {1};
        //When
        int[] actual = myClass.topKFrequent(new int[] {1}, 1);
        //Then
        TestUtils.assertArrayEquals(actual, expected);
    }



}