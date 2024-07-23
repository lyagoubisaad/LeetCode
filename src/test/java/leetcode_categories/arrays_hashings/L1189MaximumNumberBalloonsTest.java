package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class L1189MaximumNumberBalloonsTest {

    L1189MaximumNumberBalloons myClass;

    @BeforeEach
    void setUp() {
        myClass = new L1189MaximumNumberBalloons();
    }

    private static Stream<Arguments> provideTestArguments() {
        return Stream.of(
                Arguments.of("nlaebolko", 1),
                Arguments.of("loonbalxballpoon", 2),
                Arguments.of("leetcode", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestArguments")
    public void testFindAllNumbersDisappearedArray(String text, int expected) {
        // When
        int actual = myClass.maxNumberOfBalloons(text);
        // Then
        assertEquals(expected, actual);
    }

}