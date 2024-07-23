package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.TestUtils;
import java.util.stream.Stream;
public class L496NextGreaterElementITest {
    
    L496NextGreaterElementI myClass;
    
    @BeforeEach
    void setUp() {
        myClass = new L496NextGreaterElementI();
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of(new int[] {4,1,2}, new int[] {1,3,4,2}, new int[] {-1,3,-1}),
                Arguments.of(new int[] {2,4}, new int[] {1,2,3,4}, new int[] {3,-1})
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void testNextGreaterElement(int[] nums1, int[] nums2, int[] expected) {
        // When
        int[] actual = myClass.nextGreaterElement(nums1, nums2);
        // Then
        TestUtils.assertArrayEquals(expected, actual);
    }
}