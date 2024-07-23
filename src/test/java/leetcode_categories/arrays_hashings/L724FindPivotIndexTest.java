package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L724FindPivotIndexTest {

    L724FindPivotIndex myClass;

    @BeforeEach
    void setUp() {
        myClass = new L724FindPivotIndex();
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[] {1,7,3,6,5,6}, 3),
                Arguments.of(new int[] {1,2,3}, -1),
                Arguments.of(new int[] {2,1,-1}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void testFindPivotIndex(int[] nums, int expected) {
        // When
        int actual = myClass.pivotIndex(nums);
        // Then
        assertEquals(expected, actual);
    }
}