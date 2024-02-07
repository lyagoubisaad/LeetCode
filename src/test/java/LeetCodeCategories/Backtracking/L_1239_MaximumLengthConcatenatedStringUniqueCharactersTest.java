package LeetCodeCategories.Backtracking;

import org.junit.Test;
import java.util.List;

import static LeetCodeCategories.Backtracking.L_1239_MaximumLengthConcatenatedStringUniqueCharacters.maxLength;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_1239_MaximumLengthConcatenatedStringUniqueCharactersTest {
    @Test
    public void firstTest() {
        List<String> arr = List.of("un","iq","ue");
        assertEquals(4, maxLength(arr));
    }

    @Test
    public void secondTest() {
        List<String> arr = List.of("cha","r","act","ers");
        assertEquals(6, maxLength(arr));
    }

    @Test
    public void thirdTest() {
        List<String> arr = List.of("aa", "bb");
        assertEquals(0, maxLength(arr));
    }

    @Test
    public void forthTest() {
        List<String> arr = List.of("ab","ba","cd","dc","ef","fe","gh","hg","ij","ji","kl","lk","mn","nm","op","po");
        assertEquals(16, maxLength(arr));
    }
}