package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import utils.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

public class L1122RelativeSortArrayTest {

    L1122RelativeSortArray myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1122RelativeSortArray();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [2,3,1,3,2,4,6,7,9,2,19]
                [2,1,4,3,9,6]
                [28,6,22,8,44,17]
                [22,28,8,6]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] arr1 = new int[] {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = new int[] {2,1,4,3,9,6};
        //When & Then
        TestUtils.assertArrayEquals(new int[] {2,2,2,1,4,3,3,9,6,7,19}, myClass.relativeSortArray(arr1, arr2));
    }

    @Test
    public void testSecond() {
        //Given
        int[] arr1 = new int[] {28,6,22,8,44,17};
        int[] arr2 = new int[] {22,28,8,6};
        //When & Then
        TestUtils.assertArrayEquals(new int[] {22,28,8,6,17,44}, myClass.relativeSortArray(arr1, arr2));
    }

}