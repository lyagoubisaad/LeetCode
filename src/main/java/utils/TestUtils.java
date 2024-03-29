package utils;

import java.util.Arrays;

public class TestUtils {

    public static void assertArrayEquals(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(
                    "Expected: " + Arrays.toString(expected) +
                            " Actual: " + Arrays.toString(actual)
            );
        }
    }
    public static void assertArrayEquals(int[][] expected, int[][] actual) {
        if (!Arrays.deepEquals(expected, actual)) {
            throw new AssertionError(
                    "Expected: " + Arrays.deepToString(expected) +
                            " Actual: " + Arrays.deepToString(actual)
            );
        }
    }
    public static void assertArrayEquals(double[] expected, double[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError(
                    "Expected: " + Arrays.toString(expected) +
                            " Actual: " + Arrays.toString(actual)
            );
        }
    }
}
