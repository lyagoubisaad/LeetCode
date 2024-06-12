package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

public class L100SameTreeTest {

    L100SameTree myClass;

    @BeforeEach
    void setUp() {
        myClass = new L100SameTree();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode p = TreeNode.formTree(new Integer[] {1,2,3});
        TreeNode q = TreeNode.formTree(new Integer[] {1,2,3});
        //When & Then
        assertTrue(myClass.isSameTree(p, q));
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode p = TreeNode.formTree(new Integer[] {1,2});
        TreeNode q = TreeNode.formTree(new Integer[] {1,null,2});
        //When & Then
        assertFalse(myClass.isSameTree(p, q));
    }

    @Test
    public void testThird() {
        //Given
        TreeNode p = TreeNode.formTree(new Integer[] {1,2,1});
        TreeNode q = TreeNode.formTree(new Integer[] {1,1,2});
        //When & Then
        assertFalse(myClass.isSameTree(p, q));
    }

}