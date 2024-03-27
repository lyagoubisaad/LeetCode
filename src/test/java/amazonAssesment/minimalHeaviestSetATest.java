package amazonAssesment;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class minimalHeaviestSetATest {
    minimalHeaviestSetA myClass = new minimalHeaviestSetA();

    @Test
    public void firstTest() {
        assertEquals(List.of(5,7), myClass.minimalHeaviestSetA(List.of(3,7,5,5,2)));
    }

    @Test
    public void secondTest() {
        assertEquals(List.of(4,5), myClass.minimalHeaviestSetA(List.of(5,3,2,4,1,2)));
    }

    @Test
    public void thirdTest() {
        assertEquals(List.of(5,6), myClass.minimalHeaviestSetA(List.of(4,2,5,1,6)));
    }
}