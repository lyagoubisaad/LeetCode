package amazonAssesment;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class giftingGroupsTest {
    giftingGroups myClass = new giftingGroups();

    @Test
    public void firstTest() {
        assertEquals(2, myClass.countGroups(List.of("1100", "1110", "0110", "0001")));
    }

    @Test
    public void secondTest() {
        assertEquals(5, myClass.countGroups(List.of("10000", "01000", "00100", "00010", "00001")));
    }

}