package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;
import utils.TestUtils;

public class L950RevealCardsIncreasingOrderTest {

    L950RevealCardsIncreasingOrder myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L950RevealCardsIncreasingOrder();
        convertor = new Convertor();
    }
    
    @Disabled
    @Test
    void convert() {
        convertor.toBracesAndSingleQuotes("""   
                [17,13,11,2,3,5,7]
                [1,1000]
                [2,13,3,11,5,17,7]
                [1,1000]
                """);
    }

    @Test
    public void testFirst() {
        //Given
        int[] deck = new int[] {17,13,11,2,3,5,7};
        int[] expected = new int[] {2,13,3,11,5,17,7};
        //When
        int[] actual = myClass.deckRevealedIncreasing(deck);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        int[] deck = new int[] {1,1000};
        int[] expected = new int[] {1,1000};
        //When
        int[] actual = myClass.deckRevealedIncreasing(deck);
        //Then
        TestUtils.assertArrayEquals(expected, actual);
    }

    

}