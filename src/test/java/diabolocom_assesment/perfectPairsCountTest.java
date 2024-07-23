package diabolocom_assesment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class perfectPairsCountTest {

    PerfectPairsCount myClass;

    @BeforeEach
    void setUp() {
        myClass = new PerfectPairsCount();
    }

    @Test
    public void testFirst() {
        //Given
        List<Integer> arr = Arrays.asList(2,5,-3);
        //When
        long result = myClass.getPerfectPairsCount(arr);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void testSecond() {
        //Given
        List<Integer> arr = Arrays.asList(-9,6,-2,1);
        //When
        long result = myClass.getPerfectPairsCount(arr);
        //Then
        assertEquals(2, result);
    }

}