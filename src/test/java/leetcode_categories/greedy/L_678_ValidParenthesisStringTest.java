package leetcode_categories.greedy;

import org.junit.Test;

import static leetcode_categories.greedy.L_678_ValidParenthesisString.checkValidString;
import static org.junit.Assert.assertEquals;

public class L_678_ValidParenthesisStringTest {
    @Test
    public void firstTest() {
        String input = "()";
        assertEquals(true, checkValidString(input));
    }

    @Test
    public void secondTest() {
        String input = "(*)";
        assertEquals(true, checkValidString(input));
    }

    @Test
    public void thirdTest() {
        String input = "(*))";
        assertEquals(true, checkValidString(input));
    }

    @Test
    public void forthTest() {
        String input = "((((()(()()()*()(((((*)()*(**(())))))(())()())(((())())())))))))(((((())*)))()))(()((*()*(*)))(*)()";
        assertEquals(true, checkValidString(input));
    }

    @Test
    public void fifthTest() {
        String input = "(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())";
        assertEquals(false, checkValidString(input));
    }

    @Test
    public void sixsthTest() {
        String input = "(((((()*)(*)*))())())(()())())))((**)))))(()())()";
        assertEquals(false, checkValidString(input));
    }

    @Test
    public void seventhTest() {
        String input = ")";
        assertEquals(false, checkValidString(input));
    }
}