package diabolocom_assesment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TestUtils;
import utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class getGreaterThanNumberTest {

    GetGreaterThanNumber myClass;

    @BeforeEach
    void setUp() {
        myClass = new GetGreaterThanNumber();
    }

    @Test
    public void test() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[] {10,5,15,2,7,12,17});
        assertEquals(10, myClass.greaterThanNumber(root, 8));
        assertEquals(2, myClass.greaterThanNumber(root, 1));
        assertEquals(-1, myClass.greaterThanNumber(root, 18));
        assertEquals(17, myClass.greaterThanNumber(root, 16));
    }

    @Test
    public void testSecond() {
        TreeNode root = TreeNode.formTree(new Integer[] {10,5,15,2,7,12,17});
        List<Integer> expected = Arrays.asList(10,12,15,17);
        assertEquals(expected, myClass.getKgreaterThanNumber(root, 4, 8));
    }

    @Test
    public void testThird() {
        TreeNode root = TreeNode.formTree(new Integer[] {10,5,15,2,7,12,17});
        List<Integer> expected = Arrays.asList(2,5,7);
        assertEquals(expected, myClass.getKgreaterThanNumber(root, 3, 1));
    }

    @Test
    public void testForth() {
        TreeNode root = TreeNode.formTree(new Integer[] {10,5,15,2,7,12,17});
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, myClass.getKgreaterThanNumber(root, 3, 18));
    }

    @Test
    public void testFifth() {
        TreeNode root = TreeNode.formTree(new Integer[] {10,5,15,2,7,12,17});
        List<Integer> expected = Arrays.asList(17);
        assertEquals(expected, myClass.getKgreaterThanNumber(root, 3, 16));
    }

}