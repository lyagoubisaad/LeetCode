package leetcode_categories.greedy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import utils.Convertor;
import utils.TestUtils;
import java.util.stream.Stream;

public class L1605FindValidMatrixGivenRowColumnSumsTest {

    L1605FindValidMatrixGivenRowColumnSums myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L1605FindValidMatrixGivenRowColumnSums();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [3,8]
                [4,7]
                [5,7,10]
                [8,6,8]
                [[3,0],[1,7]]
                [[0,5,0],[6,1,0],[2,0,8]]                           
                """);
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testRestoreMatrix(int[] rowSum, int[] colSum, int[][] expected) {
        // When
        int[][] actual = myClass.restoreMatrix(rowSum, colSum);
        // Then
        TestUtils.assertArrayEquals(expected, actual);
    }

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 8}, new int[]{4, 7}, new int[][]{{3, 0}, {1, 7}}),
                Arguments.of(new int[]{5, 7, 10}, new int[]{8, 6, 8}, new int[][]{{5,0,0}, {3,4,0}, {0,2,8}})
        );
    }

}