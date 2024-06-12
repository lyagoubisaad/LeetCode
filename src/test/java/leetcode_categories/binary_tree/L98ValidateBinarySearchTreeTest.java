package leetcode_categories.binary_tree;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L98ValidateBinarySearchTreeTest {

    L98ValidateBinarySearchTree myClass = new L98ValidateBinarySearchTree();

    @Test
    public void firstTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {2,1,3});
        assertTrue(myClass.isValidBST(root));
    }

    @Test
    public void secondTest() {
        TreeNode root = TreeNode.formTree(new Integer[] {5,1,4,null,null,3,6});
        assertFalse(myClass.isValidBST(root));
    }



}