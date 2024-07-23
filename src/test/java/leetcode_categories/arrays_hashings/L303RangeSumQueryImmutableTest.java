package leetcode_categories.arrays_hashings;

import leetcode_categories.arrays_hashings.L303RangeSumQueryImmutable.NumArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class L303RangeSumQueryImmutableTest {

    L303RangeSumQueryImmutable myClass;

    @BeforeEach
    void setUp() {
        myClass = new L303RangeSumQueryImmutable();
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[] {-2,0,3,-5,2,-1}, 0, 2, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void testRangeSumQueryImmutable(int[] nums, int left, int right, int expected) {
        //Given
        NumArray numArray = new NumArray(nums);
        // When
        int actual = numArray.sumRange(left, right);
        // Then
        assertEquals(expected, actual);
    }


}