package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class L448FindAllNumbersDisappearedArrayTest {

    L448FindAllNumbersDisappearedArray myClass;

    @BeforeEach
    void setUp() {
        myClass = new L448FindAllNumbersDisappearedArray();
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[] {4,3,2,7,8,2,3,1}, Arrays.asList(5,6)),
                Arguments.of(new int[] {1,1}, Arrays.asList(2)),
                Arguments.of(new int[] {1,1,2,2}, Arrays.asList(3,4))
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void testFindAllNumbersDisappearedArray(int[] nums, List<Integer> expected) {
        // When
        List<Integer> actual = myClass.findDisappearedNumbers(nums);
        // Then
        assertEquals(expected, actual);
    }
}