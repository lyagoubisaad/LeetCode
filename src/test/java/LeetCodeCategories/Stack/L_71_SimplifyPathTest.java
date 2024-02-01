package LeetCodeCategories.Stack;

import org.junit.Test;

import static LeetCodeCategories.Stack.L_71_SimplifyPath.simplifyPath;
import static org.junit.Assert.assertEquals;

public class L_71_SimplifyPathTest {
    @Test
    public void firstTest() {
        String input = "/home/";
        assertEquals("/home", simplifyPath(input));
    }

    @Test
    public void secondTest() {
        String input = "/../";
        assertEquals("/", simplifyPath(input));
    }

    @Test
    public void thirdTest() {
        String input = "/home//foo/";
        assertEquals("/home/foo", simplifyPath(input));
    }

    @Test
    public void fourthTest() {
        String input = "/a/./b/../../c/";
        assertEquals("/c", simplifyPath(input));
    }

    @Test
    public void fifthTest() {
        String input = "/home/foo/.ssh/../.ssh2/authorized_keys/";
        assertEquals("/home/foo/.ssh2/authorized_keys", simplifyPath(input));
    }
}