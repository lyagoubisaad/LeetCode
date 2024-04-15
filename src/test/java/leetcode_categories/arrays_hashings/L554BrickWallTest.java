package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L554BrickWallTest {

    L554BrickWall myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L554BrickWall();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.bracketsToList("""   
                [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
                [[1],[1],[1]]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        List<List<Integer>> wall = List.of(List.of(1,2,2,1),List.of(3,1,2),List.of(1,3,2),List.of(2,4),List.of(3,1,2),List.of(1,3,1,1));
        //When
        int actual = myClass.leastBricks(wall);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testSecond() {
        //Given
        List<List<Integer>> wall = List.of(List.of(1),List.of(1),List.of(1));
        //When
        int actual = myClass.leastBricks(wall);
        //Then
        assertEquals(3, actual);
    }

}