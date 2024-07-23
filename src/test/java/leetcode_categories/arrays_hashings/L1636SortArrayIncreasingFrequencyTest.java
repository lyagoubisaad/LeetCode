package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Convertor;
import utils.TestUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class L1636SortArrayIncreasingFrequencyTest {

    L1636SortArrayIncreasingFrequency myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1636SortArrayIncreasingFrequency();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [1,1,2,2,2,3]
                [2,3,1,3,2]
                [-1,1,-6,4,5,-6,1,4,1]
                [1, 3, 3, 2, 2]
                [5, -1, 4, 4, -6, -6, 1, 1, 1]
                """);
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testFrequencySort(int[] nums, int[] expected) {
        int[] actual = myClass.frequencySort(nums);
        TestUtils.assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[] {1, 1, 2, 2, 2, 3}, new int[] {3, 1, 1, 2, 2, 2}),
                Arguments.of(new int[] {2,3,1,3,2}, new int[] {1, 3, 3, 2, 2}),
                Arguments.of(new int[] {-1,1,-6,4,5,-6,1,4,1}, new int[] {5, -1, 4, 4, -6, -6, 1, 1, 1})
        );
    }

}