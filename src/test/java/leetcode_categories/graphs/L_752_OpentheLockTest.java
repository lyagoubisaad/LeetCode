package leetcode_categories.graphs;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_752_OpentheLockTest {

    L_752_OpentheLock myClass = new L_752_OpentheLock();

    @Test
    public void firstTest() {
        String[] deadends  = new String[] {"0201","0101","0102","1212","2002"};
        String target = "0202";
        assertEquals(6, myClass.openLock(deadends,target));
    }

    @Test
    public void secondTest() {
        String[] deadends  = new String[] {"8888"};
        String target = "0009";
        assertEquals(1, myClass.openLock(deadends,target));
    }

    @Test
    public void thirdTest() {
        String[] deadends  = new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";
        assertEquals(-1, myClass.openLock(deadends,target));
    }

}