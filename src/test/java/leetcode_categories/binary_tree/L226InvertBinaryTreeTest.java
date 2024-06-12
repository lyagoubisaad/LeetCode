package leetcode_categories.binary_tree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class L226InvertBinaryTreeTest {

    L226InvertBinaryTree myClass;

    @BeforeEach
    void setUp() {
        myClass = new L226InvertBinaryTree();
    }

    @Test
    public void testFirst() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[]{4,2,7,1,3,6,9});
        TreeNode inverted = TreeNode.formTree(new Integer[]{4,7,2,9,6,3,1});
        //When & Then
        assertTrue(TreeNode.compare(inverted, myClass.invertTree(root)));
    }

    @Test
    public void testSecond() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[]{2,1,3});
        TreeNode inverted = TreeNode.formTree(new Integer[]{2,3,1});
        //When & Then
        assertTrue(TreeNode.compare(inverted, myClass.invertTree(root)));
    }

    @Test
    public void testThird() {
        //Given
        TreeNode root = TreeNode.formTree(new Integer[]{});
        TreeNode inverted = TreeNode.formTree(new Integer[]{});
        //When & Then
        assertTrue(TreeNode.compare(inverted, myClass.invertTree(root)));
    }

}