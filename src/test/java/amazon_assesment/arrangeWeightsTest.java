package amazon_assesment;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class arrangeWeightsTest {

    arrangeWeights myClass = new arrangeWeights();

    @Test
    public void firstTest() {
        List<Integer> blocks = List.of(3,2,1);
        assertEquals(3, myClass.getMinNumMoves(blocks));
    }

    @Test
    public void secondTest() {
        List<Integer> blocks = List.of(2,4,3,1,6);
        assertEquals(3, myClass.getMinNumMoves(blocks));
    }

    @Test
    public void thirdTest() {
        List<Integer> blocks = List.of(4,11,9,10,12);
        assertEquals(0, myClass.getMinNumMoves(blocks));
    }

    @Test
    public void forthTest() {
        List<Integer> blocks = List.of(2,1);
        assertEquals(1, myClass.getMinNumMoves(blocks));
    }

}