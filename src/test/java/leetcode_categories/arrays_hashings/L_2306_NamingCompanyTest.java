package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class L_2306_NamingCompanyTest {
    
    L2306NamingCompany myClass;
    
    @BeforeEach
    void setUp() {
        myClass = new L2306NamingCompany();
    }
    @Test
    public void firstTest() {
        String[] ideas = new String[] {"coffee","donuts","time","toffee"};
        assertEquals(6, myClass.distinctNames(ideas));
    }

    @Test
    public void secondTest() {
        String[] ideas = new String[] {"lack","back"};
        assertEquals(0, myClass.distinctNames(ideas));
    }

    @Test
    public void thirdTest() {
        String[] ideas = new String[] {"aaa","baa","caa","bbb","cbb","dbb"};
        assertEquals(2, myClass.distinctNames(ideas));
    }

    @Test
    public void forthTest() {
        String[] ideas = new String[] {"bzklqtbdr","kaqvdlp","r","dk"};
        assertEquals(12, myClass.distinctNames(ideas));
    }

    @Test
    public void fifthTest() {
        String[] ideas = new String[] {"alrgtxxdj","illqfngl","rlrgtxxdj"};
        assertEquals(4, myClass.distinctNames(ideas));
    }

    @Test
    public void sixthTest() {
        String[] ideas = new String[] {"wrbkfnhjw","q","i","noysvsh","p"};
        assertEquals(14, myClass.distinctNames(ideas));
    }

}