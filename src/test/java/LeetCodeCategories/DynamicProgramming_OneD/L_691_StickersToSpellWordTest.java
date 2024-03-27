package LeetCodeCategories.DynamicProgramming_OneD;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_691_StickersToSpellWordTest {

    L_691_StickersToSpellWord myClass = new L_691_StickersToSpellWord();

    @Test
    public void firstTest() {
        String[] stickers = new String[] {"with","example","science"};
        String target = "thehat";
        assertEquals(3, myClass.minStickers(stickers, target));
    }

    @Test
    public void secondTest() {
        String[] stickers = new String[] {"notice","possible"};
        String target = "basicbasic";
        assertEquals(-1, myClass.minStickers(stickers, target));
    }

}