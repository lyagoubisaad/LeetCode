package leetcode_categories.dynamic_programming_2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_474_OnesZeroesTest {

    L_474_OnesZeroes myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_474_OnesZeroes();
        convertor = new Convertor();
    }

    @Disabled
    @Test
    void convert() {
        convertor.convert("""   
               ["10","0001","111001","1","0"]
               ["10","0","1"]
               ["10","0001","111001","1","0"]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        String[] strs = new String[] {"10","0001","111001","1","0"};
        //When
        int actual = myClass.findMaxForm(strs, 5,3);
        //Then
        assertEquals(4, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] strs = new String[] {"10","0","1"};
        //When
        int actual = myClass.findMaxForm(strs, 1,1);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testThird() {
        //Given
        String[] strs = new String[] {"10","0001","111001","1","0"};
        //When
        int actual = myClass.findMaxForm(strs, 4,3);
        //Then
        assertEquals(3, actual);
    }




}