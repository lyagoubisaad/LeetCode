package amazon_assesment;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class handleRequestsTest {

    handleRequests myClass = new handleRequests();

    @Test
    public void firstTest() {
        assertEquals(List.of(4,2,1,0), myClass.findRequestsInQueue(List.of(2,2,3,1)));
    }

    @Test
    public void secondTest() {
        assertEquals(List.of(4,1,0), myClass.findRequestsInQueue(List.of(3,1,2,1)));
    }

    @Test
    public void thirdTest() {
        assertEquals(List.of(3,2,1,0), myClass.findRequestsInQueue(List.of(4,4,4)));
    }

    @Test
    public void forthTest() {
        assertEquals(List.of(8, 3, 2, 1, 0), myClass.findRequestsInQueue(List.of(7,6,3,1,1,1,1,0)));
    }

    @Test
    public void fifthTest() {
        assertEquals(List.of(6, 3, 2, 1, 0), myClass.findRequestsInQueue(List.of(4,1,1,2,4,3)));
    }

}