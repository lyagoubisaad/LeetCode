package LeetCodeCategories.ArrayAndHashings;

import org.junit.Test;

import static LeetCodeCategories.ArrayAndHashings.L_2306_NamingaCompany.distinctNames;
import static org.junit.Assert.assertEquals;

public class L_2306_NamingaCompanyTest {
    @Test
    public void firstTest() {
        String[] ideas = new String[] {"coffee","donuts","time","toffee"};
        assertEquals(6, distinctNames(ideas));
    }

    @Test
    public void secondTest() {
        String[] ideas = new String[] {"lack","back"};
        assertEquals(0, distinctNames(ideas));
    }

    @Test
    public void thirdTest() {
        String[] ideas = new String[] {"aaa","baa","caa","bbb","cbb","dbb"};
        assertEquals(2, distinctNames(ideas));
    }

    @Test
    public void forthTest() {
        String[] ideas = new String[] {"bzklqtbdr","kaqvdlp","r","dk"};
        assertEquals(12, distinctNames(ideas));
    }

    @Test
    public void fifthTest() {
        String[] ideas = new String[] {"alrgtxxdj","illqfngl","rlrgtxxdj"};
        assertEquals(4, distinctNames(ideas));
    }

    @Test
    public void sixthTest() {
        String[] ideas = new String[] {"wrbkfnhjw","q","i","noysvsh","p"};
        assertEquals(14, distinctNames(ideas));
    }

}